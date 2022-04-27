import People.Passengers.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Collin Juha", 1);
    }

    @Test
    public void canGetName(){
        assertEquals("Collin Juha", passenger.getName());
    }

    @Test
    public void canSetName(){
        passenger.setName("Collin Clay");
        assertEquals("Collin Clay", passenger.getName());
    }

    @Test
    public void canGetNumBags(){assertEquals(1, passenger.getNumOfBags());}


    @Test
    public void flightNumberBeginsEmpty(){
        assertEquals("", passenger.getFlightNumber());
    }

    @Test
    public void canSetFlightNumber(){
        passenger.setFlightNumber("myTest");
        assertEquals("myTest", passenger.getFlightNumber());
    }

}
