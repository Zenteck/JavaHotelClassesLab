import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before(){
        guest1 = new Guest("Greg");
        guest2 = new Guest("Alan");
        guest3 = new Guest("Erebus");
        bedroom = new Bedroom(1, 2, "Twin");
        bedroom.addGuest(guest1);
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canGetType(){
        assertEquals("Twin", bedroom.getType());
    }

//    @Test
//    public void canGetOccupants(){
//        assertEquals(1, bedroom.getOccupants());
//    }

    @Test
    public void canCountOccupants(){
        assertEquals(1, bedroom.countOccupants());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest2);
        assertEquals(2, bedroom.countOccupants());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.removeGuest(guest1);
        assertEquals(0, bedroom.countOccupants());
    }

    @Test
    public void roomFull(){
        bedroom.addGuest(guest2);
        assertEquals(false, bedroom.addGuest(guest3));
    }

}
