package Exercise_2;

public class Bus extends Vehicle{


    @Override
    public void printState() {
        System.out.println(getClass()+" -> gear: "+getGear()+", speed: "+getSpeed());
    }
}
