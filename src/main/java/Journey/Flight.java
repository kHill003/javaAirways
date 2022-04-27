package Journey;

import Journey.Airplanes.Plane;
import People.Crew.AllCrew;
import People.Crew.CabinCrew;
import People.Crew.Pilot;
import People.Passengers.Passenger;

import java.util.ArrayList;
public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrews;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNum;
    private Airports departureAirport;
    private Airports arrivalAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNum, Airports arrivalAirport,
                  Airports departureAirport, String departureTime) {
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrews = new ArrayList<CabinCrew>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNum = flightNum;
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int getPilots() {
        return pilots.size();
    }

    public void addPilot(Pilot pilots) {
        this.pilots.add(pilots);
    }

    public int getCrew() {
        return cabinCrews.size();
    }

    public int getPassengers() {
        return passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void addCrewMember(CabinCrew cabinCrews) {
        this.cabinCrews.add(cabinCrews);
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String setFlightNum(String flightNum) {
        this.flightNum = flightNum;
        return flightNum;
    }

    public String getDepartureAirport() {
        return departureAirport.getAbv();
    }

    public String getArrivalAirport() {
        return arrivalAirport.getAbv();
    }

    public int getThisPlaneCapacity() {
        return plane.getPlaneCapacity();
    }

    public int getThisPlaneWeight() {
        return plane.getPlaneWeight();
    }

    public void addPassengertoPlane(Passenger passenger) {
        if (this.plane.getPlaneCapacity() > this.getPassengers()) {
            this.passengers.add(passenger);
        }
    }

    public int checkRemainingSeats() {
        return (this.plane.getPlaneCapacity() - this.getPassengers());

    }
    public String getDepartureTime(){
        return departureTime;
    }
    public String setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
        return departureTime;
    }
}
