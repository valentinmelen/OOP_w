package Exercise_3;

public class Main {

    public static void main(String[] args) {

        Swimmer s= new Swimmer();
        s.swim();
        s.breath();

        System.out.println();

        Walker w = new Walker();
        w.walk();
        w.breath();

    }

}
