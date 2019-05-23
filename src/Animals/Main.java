package Animals;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal(3, 12, true);
        Dog dog = new Dog(7, 15, false, "black");
        Animal dog2 = new Dog(6, 10, false, "white");

        display(animal);
        animal.bark();

        display(dog);
        dog.bark();

        display(dog2);

    }

    public static void display(Animal a) {//polimorfism
        System.out.println("\nMethod was called with " + a.getClass());
        if (a instanceof Animal) {
            Animal an = (Animal) a;
            System.out.println(an.toString());
        }
        a.eat();
    }

}
