package Exercise_2;

public class Truck extends Vehicle {
    @Override
    public void printState() {
        System.out.println(getClass()+" -> gear: "+getGear()+", speed: "+getSpeed());
    }
}
