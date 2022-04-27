package Journey;
import java.time.LocalDateTime;


import Journey.Airplanes.Plane;
import People.Crew.AllCrew;
import People.Crew.CabinCrew;
import People.Crew.Pilot;
import People.Passengers.Passenger;
import java.util.Random;

import java.time.LocalDateTime;
import java.util.ArrayList;
public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrews;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNum;
    private Airports departureAirport;
    private Airports arrivalAirport;
    // private String departureTime;
    private LocalDateTime departureTime;

    public Flight(Plane plane, String flightNum, Airports arrivalAirport,
                  Airports departureAirport, String departureTime) {
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrews = new ArrayList<CabinCrew>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNum = flightNum;
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
        this.departureTime = this.formatDepartureTime(departureTime);
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

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String newDepartureTime) {
        this.departureTime = this.formatDepartureTime(newDepartureTime);
    }

    public LocalDateTime formatDepartureTime(String givenDepartureTime) {
        String[] splitString = givenDepartureTime.split("[/ :]");
        LocalDateTime newDateTime = LocalDateTime.of(
                Integer.parseInt(splitString[0]),
                Integer.parseInt(splitString[1]),
                Integer.parseInt(splitString[2]),
                Integer.parseInt(splitString[3]),
                Integer.parseInt(splitString[4]));
        return newDateTime;
    }
    public int generateRandomSeat(){
        Random rand = new Random();

     int seatNumber = rand.nextInt(this.plane.getPlaneCapacity() + 1);
        System.out.print(seatNumber);
        return seatNumber;

    }
    public ArrayList<Passenger> getPassengerManifest(){
        return this.passengers;
    }
    public void setPassengerFlightNumber(Passenger passenger, String flightNumberToSet){
        passenger.setFlightNumber(flightNumberToSet);
    }
    public boolean checkForUniqueSeat(int generatedSeat){
        ArrayList<Integer> seatsTaken = new ArrayList<Integer>();

        for(Passenger passenger: this.passengers){
            seatsTaken.add(passenger.getSeatNumber());
        }

        return seatsTaken.contains(generatedSeat);
    }
}
