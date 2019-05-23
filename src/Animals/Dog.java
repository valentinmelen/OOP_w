package Animals;

public class Dog extends Animal {

    private String color;

    public Dog(int age, int numberOfLegs, boolean vegetarian, String color) {
        super(age, numberOfLegs, vegetarian);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void bark(){
        System.out.println("Barck");
    }

    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public String toString(){
      return super.toString()+", color: "+this.getColor();
    }

}
