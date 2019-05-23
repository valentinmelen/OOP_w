package Person;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Adi","Andrei","Popescu");
        User user2 = new User("Emi","Emanuel","Zaharie");

        System.out.println(user1.generateDisplayName());
        System.out.println(user2.generateDisplayName());




    }
}
