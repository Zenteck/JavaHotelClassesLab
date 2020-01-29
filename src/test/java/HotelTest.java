import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HotelTest {

    private Hotel hotel;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom("Cadia", 2);
        conferenceRoom2 = new ConferenceRoom("Vigilus", 3);
        bedroom1 = new Bedroom(1, 2, "Twin");
        bedroom2 = new Bedroom(4, 1, "Single");
        guest1 = new Guest("Greg");
        guest2 = new Guest("Alan");
        guest3 = new Guest("Erebus");
        hotel = new Hotel();
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addConferenceRoom(conferenceRoom1);
        hotel.addConferenceRoom(conferenceRoom2);
    }

    @Test
    public void canAddBedrooms(){
        assertEquals(2, hotel.countBedrooms());
    }

    @Test
    public void canAddConferenceRooms(){
        assertEquals(2, hotel.countConferenceRooms());
    }

    @Test
    public void canBedroomCheckIn(){
        hotel.bedroomCheckIn(bedroom1, guest1);
        assertEquals(1, bedroom1.countOccupants());
        assertNotNull(bedroom1.getOccupants());
    }

    @Test
    public void canBedroomCheckOut(){
        hotel.bedroomCheckIn(bedroom1, guest1);
        hotel.bedroomCheckIn(bedroom1, guest3);
        hotel.bedroomCheckOut(bedroom1, guest1);
        assertEquals(1, bedroom1.countOccupants());
    }
    @Test
    public void canConferenceRoomCheckIn(){
        hotel.conferenceRoomCheckIn(conferenceRoom1, guest2);
        hotel.conferenceRoomCheckIn(conferenceRoom1, guest1);
        assertEquals(2, conferenceRoom1.countOccupants());
        assertNotNull(conferenceRoom1.getOccupants());
    }
    @Test
    public void canConferenceRoomOut(){
        hotel.conferenceRoomCheckIn(conferenceRoom1, guest2);
        hotel.conferenceRoomCheckIn(conferenceRoom1, guest1);
        hotel.conferenceRoomCheckOut(conferenceRoom1, guest1);
        assertEquals(1, conferenceRoom1.countOccupants());
    }

}