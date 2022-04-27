package People.Passengers;

import People.PeopleSuper;

public class Passenger extends PeopleSuper {
    private int numOfBags;

    public Passenger(String name, int numOfBags){
        super(name);
        this.numOfBags =numOfBags;
    }

    public int getNumOfBags() {
        return numOfBags;
    }

}
