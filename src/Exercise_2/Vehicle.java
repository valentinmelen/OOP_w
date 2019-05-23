package Exercise_2;

public abstract class Vehicle {

    private int speed;
    private int gear;

    public void changeGear(int newGear) {
        this.setGear(newGear);
    }

    public void speedUp(int increment) {
        this.setSpeed(speed + increment);
    }

    public void applyBrakes(int decrement) {
        this.setSpeed(speed - decrement);
    }

    public abstract void printState();



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}

