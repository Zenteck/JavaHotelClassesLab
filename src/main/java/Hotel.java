import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;

    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public int countBedrooms() {
        return this.bedrooms.size();
    }

    public int countConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void bedroomCheckIn(Bedroom bedroom, Guest guest) {
        bedroom.addGuest(guest);
    }

    public void bedroomCheckOut(Bedroom bedroom, Guest guest) {
        bedroom.removeGuest(guest);
    }

    public void conferenceRoomCheckIn(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.addGuest(guest);
    }

    public void conferenceRoomCheckOut(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.removeGuest(guest);
    }

    public void bookRoom(Bedroom bedroom, int nights) {
        Booking newBooking = new Booking(bedroom, nights);
        this.bookings.add(newBooking);
    }

    public int countBookings() {
        return this.bookings.size();
    }
}
