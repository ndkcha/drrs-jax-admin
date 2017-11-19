import server.AdminOperations;
import server.TimeSlot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdminMethods {
    private AdminOperations adminOps;

    AdminMethods(AdminOperations adminOps) {
        this.adminOps = adminOps;
    }

    boolean createRoom(Scanner scan) {
        List<TimeSlot> timeSlots = new ArrayList<>();
        int roomNo, noOfTimeSlots;
        String date, start, end, response;
        boolean isMoreSlots, success = false;

        // ask necessary things
        System.out.print("Enter the date (format: dd-MM-yyyy, e.g. 11-01-2018)\n : ");
        date = scan.nextLine();

        System.out.print("Enter the room number (integer values only)\n : ");
        roomNo = scan.nextInt();
        scan.nextLine();

        System.out.println("\nEntries for the time-slots:");

        do {
            System.out.print("\nEnter the start time (hh:mm): ");
            start = scan.nextLine();

            System.out.print("Enter the end time (hh:mm): ");
            end = scan.nextLine();

            TimeSlot slot = new TimeSlot();
            slot.setStartTime(start);
            slot.setEndTime(end);
            timeSlots.add(slot);

            System.out.print("Add another time-slot? (y/n):");
            response = scan.nextLine();

            isMoreSlots = response.equalsIgnoreCase("y");
        } while (isMoreSlots);

        // hit
        success = adminOps.createRoom(date, roomNo, timeSlots);

        // respond
        return success;
    }

    boolean deleteRoom(Scanner scan) {
        List<TimeSlot> timeSlots = new ArrayList<>();
        int roomNo, noOfTimeSlots;
        String date, start, end, response;
        boolean isMoreSlots, success = false;

        // ask necessary things
        System.out.print("Enter the date (format: dd-MM-yyyy, e.g. 11-01-2018)\n : ");
        date = scan.nextLine();

        System.out.print("Enter the room number (integer values only)\n : ");
        roomNo = scan.nextInt();
        scan.nextLine();

        System.out.println("\nEntries for the time-slots:");

        do {
            System.out.print("\nEnter the start time (hh:mm): ");
            start = scan.nextLine();

            System.out.print("Enter the end time (hh:mm): ");
            end = scan.nextLine();

            TimeSlot slot = new TimeSlot();
            slot.setStartTime(start);
            slot.setEndTime(end);
            timeSlots.add(slot);

            System.out.print("Add another time-slot? (y/n): ");
            response = scan.nextLine();

            isMoreSlots = response.equalsIgnoreCase("y");
        } while (isMoreSlots);

        // perform the operation
        success = adminOps.deleteRoom(date, roomNo, timeSlots);

        return success;
    }
}
