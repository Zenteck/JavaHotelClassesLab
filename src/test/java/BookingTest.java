import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;


    @Before
    public void before(){
        bedroom = new Bedroom(1, 2, "Twin");
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void hasBedroom(){
        assertEquals(bedroom, booking.getRoom());
    }

    @Test
    public void hasNights(){
        assertEquals(3, booking.getNights());
    }

}
