package People.Passengers;
import java.util.Random;

import Journey.Flight;
import People.PeopleSuper;

public class Passenger extends PeopleSuper {
    private int numOfBags;
    private String flightNumber;
    private int seatNumber;
    private int upperBound;


    public Passenger(String name, int numOfBags){
        super(name);
        this.numOfBags =numOfBags;
        //We leave the flight number as an empty string as it is assighned when
        // the passenger books the flight;
        this.flightNumber = "";
        this.seatNumber = 0;


    }

    public int getNumOfBags() {
        return numOfBags;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
