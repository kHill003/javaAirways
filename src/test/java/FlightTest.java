import Journey.Airplanes.Plane;
import Journey.Airplanes.PlaneTypes;
import Journey.Airports;
import Journey.Flight;
import People.Crew.CabinCrew;
import People.Crew.CrewRoles;
import People.Crew.Pilot;
import People.Passengers.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Plane plane;
    Pilot pilot;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    CabinCrew cabinCrew3;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;


    @Before
    public void before() {flight = new Flight(new Plane(PlaneTypes.JET_THREE),"78", Airports.DENVER,
            Airports.EDINBURGH,"2022/02/15 10:15");

    passenger1 = new Passenger("Lorraine",2);
    passenger2 = new Passenger("Shireen", 1);
    passenger3 = new Passenger("Bear", 2);
    pilot = new Pilot("Dr Barky", CrewRoles.PILOT,"303");
    cabinCrew1 = new CabinCrew("Princess Lia", CrewRoles.HOST);
    cabinCrew2 = new CabinCrew("Tony The Tiger",CrewRoles.FIRST_AIDER);
    cabinCrew3 = new CabinCrew("Dr Spock", CrewRoles.TEAM_LEADER);

    }
    @Test
    public void pilotBeginsEmpty() {
        assertEquals(0, flight.getPilots());
    }

    @Test
    public void canAddPilots() {
        flight.addPilot(pilot);
        assertEquals(1, flight.getPilots());
    }
    @Test
    public void crewBeginsEmpty() {
        assertEquals(0, flight.getCrew());
    }

    @Test
    public void passengersBeginsEmpty() {
        assertEquals(0, flight.getPassengers());}
    @Test
    public void canAddPassenger() {
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getPassengers());
    }
    @Test
    public void canAddCrew() {
        flight.addCrewMember(cabinCrew2);
        assertEquals(1, flight.getCrew());
    }
    @Test
    public void getPlaneType(){
        Plane plane = flight.getPlane();
        assertEquals("JET_THREE", plane.getType().toString());
    }
    @Test
    public void getTheFlightNumber()
    {
        assertEquals("78", flight.getFlightNum());
    }
    @Test
    public void canSetFlightNumber(){
      flight.setFlightNum("42");
        assertEquals("42", flight.getFlightNum());
    }
 @Test
    public void getDepartureAirport(){
     assertEquals("EDI", flight.getDepartureAirport());
}
    @Test
    public void getArrivalAirport(){
        assertEquals("DEN", flight.getArrivalAirport());
    }
   @Test
   public void getThisPlaneCapacityTest(){
       assertEquals(300, flight.getThisPlaneCapacity());
   }
   @Test
    public void getThisPlaneWeightInitalTest(){
       assertEquals(600, flight.getThisPlaneWeight());
   }

    @Test
    public void canReturnRemainingSeats() {
        flight.addPassenger(passenger1);
        assertEquals(299, flight.checkRemainingSeats());
    }
    @Test
    public void canGetDepartureTime() {
        assertEquals("2022-02-15T10:15", flight.getDepartureTime().toString());
    }

    @Test
    public void canSetDepartureTime() {
        flight.setDepartureTime("2022/02/15 10:15");
        assertEquals("2022-02-15T10:15", flight.getDepartureTime().toString());
    }
}
