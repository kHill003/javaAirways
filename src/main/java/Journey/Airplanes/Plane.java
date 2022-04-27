package Journey.Airplanes;

public class Plane {
  private PlaneTypes type;

    public Plane(PlaneTypes type) {
        this.type = type;
    }

    public PlaneTypes getType() {
        return type;
    }


    public int getPlaneCapacity(){
        return this.type.getCapacity();
    }

    public int getPlaneWeight(){return this.type.getTotalWeight();}

    }





