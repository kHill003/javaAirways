import Journey.Airplanes.Plane;
import Journey.Airplanes.PlaneTypes;
import Journey.Airports;
import Journey.Flight;
import Journey.FlightManager;
import People.Passengers.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Plane plane;
    private Passenger passenger1;
    private  Passenger passenger2;
    private  Passenger passenger3;


    @Before
    public void before() {
        //This is very cool.  we are feeding the instance of a class into the
        //setUp of the instance to be tested.
        passenger1 = new Passenger("Ian Jones", 2);
        passenger2 = new Passenger("James Hunter", 3);
        passenger3 = new Passenger("Ted Wing", 1);
        plane = new Plane(PlaneTypes.JET_TWO);
        flight = new Flight(plane, "303", Airports.DELHI,
                Airports.DENVER,"13:03");
        flightManager = new FlightManager(flight);

    }
    @Test
    public void canGetFlightBaggageData(){
        assertEquals(1500, flightManager.getBaggageData());
    }

    @Test
    public void getThisPlaneCap(){
        assertEquals(500, flight.getThisPlaneCapacity());
    }
    @Test
    public void canCalculateTheWeightForBags(){

        assertEquals(750, flightManager.calculateCargoSpace());
    }
    @Test
    public void canGetFlight(){
        Flight currentFlight = flightManager.getFlight();
        assertEquals("303", currentFlight.getFlightNum());
    }
    @Test
    public void canGetWeightAllowancePerCustomer(){
        Flight currentFlight = flightManager.getFlight();
        currentFlight.addPassenger(passenger1);
        currentFlight.addPassenger(passenger2);
        currentFlight.addPassenger(passenger3);
        assertEquals(250, flightManager.passengerBaggageAllowed());
    }
    public void canFindCurrentAmountOfBaggage(){
        Flight currentFlight = flightManager.getFlight();
        currentFlight.addPassenger(passenger1);
        currentFlight.addPassenger(passenger2);
        assertEquals(500, flightManager.currentAmtOfBaggage());
    }
    public void canDetermineHowMuchSpaceIsLeft(){
        Flight currentFlight = flightManager.getFlight();
        currentFlight.addPassenger(passenger1);
        currentFlight.addPassenger(passenger2);
        assertEquals(250, flightManager.spaceRemainingForBaggage());
    }

}
