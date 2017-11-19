
package server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteRoomResponse_QNAME = new QName("http://server/", "deleteRoomResponse");
    private final static QName _ResetBookings_QNAME = new QName("http://server/", "resetBookings");
    private final static QName _GenerateAdminId_QNAME = new QName("http://server/", "generateAdminId");
    private final static QName _CreateRoom_QNAME = new QName("http://server/", "createRoom");
    private final static QName _LookupAdmin_QNAME = new QName("http://server/", "lookupAdmin");
    private final static QName _DeleteRoom_QNAME = new QName("http://server/", "deleteRoom");
    private final static QName _ResetBookingsResponse_QNAME = new QName("http://server/", "resetBookingsResponse");
    private final static QName _LookupAdminResponse_QNAME = new QName("http://server/", "lookupAdminResponse");
    private final static QName _CreateRoomResponse_QNAME = new QName("http://server/", "createRoomResponse");
    private final static QName _GenerateAdminIdResponse_QNAME = new QName("http://server/", "generateAdminIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenerateAdminIdResponse }
     * 
     */
    public GenerateAdminIdResponse createGenerateAdminIdResponse() {
        return new GenerateAdminIdResponse();
    }

    /**
     * Create an instance of {@link LookupAdminResponse }
     * 
     */
    public LookupAdminResponse createLookupAdminResponse() {
        return new LookupAdminResponse();
    }

    /**
     * Create an instance of {@link CreateRoomResponse }
     * 
     */
    public CreateRoomResponse createCreateRoomResponse() {
        return new CreateRoomResponse();
    }

    /**
     * Create an instance of {@link DeleteRoom }
     * 
     */
    public DeleteRoom createDeleteRoom() {
        return new DeleteRoom();
    }

    /**
     * Create an instance of {@link ResetBookingsResponse }
     * 
     */
    public ResetBookingsResponse createResetBookingsResponse() {
        return new ResetBookingsResponse();
    }

    /**
     * Create an instance of {@link CreateRoom }
     * 
     */
    public CreateRoom createCreateRoom() {
        return new CreateRoom();
    }

    /**
     * Create an instance of {@link LookupAdmin }
     * 
     */
    public LookupAdmin createLookupAdmin() {
        return new LookupAdmin();
    }

    /**
     * Create an instance of {@link DeleteRoomResponse }
     * 
     */
    public DeleteRoomResponse createDeleteRoomResponse() {
        return new DeleteRoomResponse();
    }

    /**
     * Create an instance of {@link ResetBookings }
     * 
     */
    public ResetBookings createResetBookings() {
        return new ResetBookings();
    }

    /**
     * Create an instance of {@link GenerateAdminId }
     * 
     */
    public GenerateAdminId createGenerateAdminId() {
        return new GenerateAdminId();
    }

    /**
     * Create an instance of {@link TimeSlot }
     * 
     */
    public TimeSlot createTimeSlot() {
        return new TimeSlot();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "deleteRoomResponse")
    public JAXBElement<DeleteRoomResponse> createDeleteRoomResponse(DeleteRoomResponse value) {
        return new JAXBElement<DeleteRoomResponse>(_DeleteRoomResponse_QNAME, DeleteRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetBookings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "resetBookings")
    public JAXBElement<ResetBookings> createResetBookings(ResetBookings value) {
        return new JAXBElement<ResetBookings>(_ResetBookings_QNAME, ResetBookings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateAdminId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "generateAdminId")
    public JAXBElement<GenerateAdminId> createGenerateAdminId(GenerateAdminId value) {
        return new JAXBElement<GenerateAdminId>(_GenerateAdminId_QNAME, GenerateAdminId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "createRoom")
    public JAXBElement<CreateRoom> createCreateRoom(CreateRoom value) {
        return new JAXBElement<CreateRoom>(_CreateRoom_QNAME, CreateRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "lookupAdmin")
    public JAXBElement<LookupAdmin> createLookupAdmin(LookupAdmin value) {
        return new JAXBElement<LookupAdmin>(_LookupAdmin_QNAME, LookupAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "deleteRoom")
    public JAXBElement<DeleteRoom> createDeleteRoom(DeleteRoom value) {
        return new JAXBElement<DeleteRoom>(_DeleteRoom_QNAME, DeleteRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetBookingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "resetBookingsResponse")
    public JAXBElement<ResetBookingsResponse> createResetBookingsResponse(ResetBookingsResponse value) {
        return new JAXBElement<ResetBookingsResponse>(_ResetBookingsResponse_QNAME, ResetBookingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "lookupAdminResponse")
    public JAXBElement<LookupAdminResponse> createLookupAdminResponse(LookupAdminResponse value) {
        return new JAXBElement<LookupAdminResponse>(_LookupAdminResponse_QNAME, LookupAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "createRoomResponse")
    public JAXBElement<CreateRoomResponse> createCreateRoomResponse(CreateRoomResponse value) {
        return new JAXBElement<CreateRoomResponse>(_CreateRoomResponse_QNAME, CreateRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateAdminIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "generateAdminIdResponse")
    public JAXBElement<GenerateAdminIdResponse> createGenerateAdminIdResponse(GenerateAdminIdResponse value) {
        return new JAXBElement<GenerateAdminIdResponse>(_GenerateAdminIdResponse_QNAME, GenerateAdminIdResponse.class, null, value);
    }

}
