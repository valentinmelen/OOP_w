package Exercise_3;

public class Swimmer implements Swim, Breath{

    @Override
    public void swim() {
        System.out.println(getClass()+" -> the swim method was called.");
    }

    @Override
    public void breath() {
        System.out.println(getClass()+" -> the breath method was called.");
    }
}
