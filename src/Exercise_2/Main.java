package Exercise_2;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();

        truck.changeGear(2);
        truck.speedUp(3);
        truck.applyBrakes(1);
        truck.printState();


        Bus bus = new Bus();

        bus.changeGear(1);
        bus.speedUp(4);
        bus.applyBrakes(3);
        bus.printState();
    }
}
