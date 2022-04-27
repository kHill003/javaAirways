package People.Passengers;

import Journey.Flight;
import People.PeopleSuper;

public class Passenger extends PeopleSuper {
    private int numOfBags;
    private String flightNumber;

    public Passenger(String name, int numOfBags){
        super(name);
        this.numOfBags =numOfBags;
        //We leave the flight number as an empty string as it is assighned when
        // the passenger books the flight;
        this.flightNumber = "";
    }

    public int getNumOfBags() {
        return numOfBags;
    }
    public String getFlightNumber(){
        return flightNumber;
    }
    public String setFlightNumber(String flightNumber){
        this.flightNumber = flightNumber;
        return flightNumber;
    }
}
