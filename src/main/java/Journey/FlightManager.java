package Journey;

import People.Passengers.Passenger;

import java.util.ArrayList;

public class FlightManager {

    private final Flight flight;
    private final int BaggageData;


    public FlightManager(Flight flight) {
        this.flight = flight;
        this.BaggageData = flight.getThisPlaneWeight();

    }

    public int getBaggageData() {
        return BaggageData;
    }

    public int calculateCargoSpace() {
        return BaggageData / 2;
    }
    public Flight getFlight(){
        return this.flight;
    }
    public int passengerBaggageAllowed(){
        int passengerCount = this.flight.getPassengers();
        return (this.calculateCargoSpace() / passengerCount);
    }
public int currentAmtOfBaggage(){
      int numPassengers =  this.flight.getPassengers();
        int howMuchBaggage = this.passengerBaggageAllowed();
        return(numPassengers * howMuchBaggage);
}
public int spaceRemainingForBaggage(){
        int howMuchTotalSpaceForBags = this.flight.getThisPlaneCapacity();
        int howMuchBaggageSpaceIsUsed = currentAmtOfBaggage();
        return howMuchTotalSpaceForBags - howMuchBaggageSpaceIsUsed;
}
}
