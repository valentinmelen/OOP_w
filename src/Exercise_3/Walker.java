package Exercise_3;

public class Walker implements Walk, Breath {

    @Override
    public void walk() {
        System.out.println(getClass()+" -> the walk method was called.");
    }

    @Override
    public void breath() {
        System.out.println(getClass()+" -> the breath method was called");

    }
}
