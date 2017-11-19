import server.AdminOperations;
import server.AdminOperationsService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class AdminClient {
    public static void main(String[] args) {
        boolean isExitRequested = false, success;
        int choice, wsPort = -1;
        String message, adminId = null, response, code, servers;
        Logger logs = Logger.getLogger("Admin Client");
        Scanner scan = new Scanner(System.in);
        AdminOperations adminOps;
        AdminOperationsService service;
        AdminMethods methods;

        // no list. exit.
        if (args.length != 1) {
            System.out.println("Usage: java AdminClient <server-directory>\nWhere, <server-directory> is the list of servers available to the client");
            return;
        }

        // ask where to go
        System.out.print("Do you have an adminId? (y/n): ");
        response = scan.nextLine();

        if (response.equalsIgnoreCase("y")) {
            System.out.print("\nEnter your adminId: ");
            adminId = scan.nextLine();
            code = adminId.substring(0, 3).toUpperCase();
        } else {
            System.out.print("\nEnter the campus code you're allotted to: ");
            code = scan.nextLine();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            servers = reader.readLine();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            return;
        }

        // add the network of campus servers to the memory
        String[] campusList = servers.split(";");
        for (String item : campusList) {
            String[] campusDetails = item.split(",");
            if (campusDetails[0].equalsIgnoreCase(code)) {
                wsPort = Integer.parseInt(campusDetails[1]);
                break;
            }
        }

        if (wsPort == -1) {
            logs.severe("No campus found!");
            return;
        }

        try {
            URL url = new URL("http://localhost:" + wsPort + "/admin?wsdl");

            service = new AdminOperationsService(url);
        } catch (MalformedURLException urlException) {
            logs.severe("There has been a problem with URL.\nMessage: " + urlException.getMessage());
            return;
        }

        // get the remote reference from the webservice
        adminOps = service.getAdminOperationsPort();

        // no remote. no work.
        if (adminOps == null) {
            logs.severe("Error initializing web service object. Try again later!");
            return;
        }

        // setup the implementation class of the client
        methods = new AdminMethods(adminOps);

        if (adminId == null) {
            adminId = adminOps.generateAdminId();
            System.out.println("\nYour new adminId is " + adminId + ".\n");
        }

        // lookup the adminId at server
        if (!adminOps.lookupAdmin(adminId)) {
            logs.warning("No entry found for the adminId, " + adminId);
            return;
        }

        // set up file handler for logging mechanism.
        try {
            FileHandler handler = new FileHandler(adminId + ".log", true);
            logs.addHandler(handler);
        } catch (IOException ioe) {
            logs.warning("Error initializing log file.\n Message: " + ioe.getMessage());
        }

        // be nice
        System.out.println("\tWelcome to the campus!\n");

        do {
            // ask what to do
            System.out.println("What do you want to do?\n\t1. Create a room\n\t2. Delete a room\n\t3. Reset the bookings\nAny other number to exit");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                // create a room
                case 1:
                    success = methods.createRoom(scan);
                    message = success ? "A room has successfully been created." : "An unexpected error thrown while creating a room.";
                    break;
                // delete a room
                case 2:
                    success = methods.deleteRoom(scan);
                    message = success ? "The room has successfully been deleted." : "An unexpected error thrown while deleting a room.";
                    break;
                case 3:
                    success = adminOps.resetBookings();
                    message = success ? "All the bookings have been reset to none" : "You are not authorized to reset the bookings.";
                    break;
                // exit
                default:
                    message = "Exit requested! Have a nice day!";
                    success = true;
                    isExitRequested = true;
                    break;
            }

            if (success)
                logs.info(message);
            else
                logs.warning(message);
        } while (!isExitRequested);

        scan.close();
    }
}
