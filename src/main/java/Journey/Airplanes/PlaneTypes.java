package Journey.Airplanes;

public enum PlaneTypes {
    JET_ONE(2000, 170),
    JET_TWO (1500, 500),
    JET_THREE(600, 300);

    private final int totalWeight;
    private final int capacity;

   PlaneTypes(int totalWeight, int capacity) {
        this.totalWeight = totalWeight;
        this.capacity = capacity;
    }
   public int getCapacity(){
       return capacity;
   }
   public int getTotalWeight(){
       return totalWeight;
   }
}
