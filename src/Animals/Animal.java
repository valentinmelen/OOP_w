package Animals;

public class Animal {

    private int age;
    private int numberOfLegs;
    private boolean vegetarian;


    public Animal(int age, int numberOfLegs, boolean vegetarian){
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.vegetarian = vegetarian;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }


    public void bark() {
        System.out.println("Bark");
    }
    @Override
    public String toString(){
        return "Age: "+this.getAge()+", number of legs "+this.getNumberOfLegs()+", vegetarian: "+this.isVegetarian();
    }
}

