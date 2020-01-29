import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before() {
        guest1 = new Guest("Greg");
        guest2 = new Guest("Alan");
        guest3 = new Guest("Erebus");
        conferenceRoom = new ConferenceRoom("Cadia", 2);
        conferenceRoom.addGuest(guest3);
    }

    @Test
    public void hasName(){
        assertEquals("Cadia", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, conferenceRoom.getCapacity());
    }

    @Test
    public void canAddGuests(){
        conferenceRoom.addGuest(guest1);
        assertEquals(2, conferenceRoom.countOccupants());
    }
    @Test
    public void canRemoveGuest(){
        conferenceRoom.removeGuest(guest3);
        assertEquals(0, conferenceRoom.countOccupants());
    }

    @Test
    public void roomFull() {
        conferenceRoom.addGuest(guest2);
        assertEquals(false, conferenceRoom.addGuest(guest1));
    }


}
