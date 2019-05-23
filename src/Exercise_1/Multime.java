package Exercise_1;

public class Multime {

    private int[] date;
    private static int DIM;
    private int n;

    public Multime() {
        DIM = 10;
        date = new int[DIM];
        n = 0;
    }

    public Multime(int DIM) {
        this.DIM = DIM;
        date = new int[DIM];
        n = 0;
    }

    public void adauga(int element) {//adauga un element in multime

        boolean elementExist = false;

        for (int i = 0; i < date.length; i++) {
            if (date[i] == element) {
                elementExist = true;
                break;
            }
        }
        if (!elementExist && n < DIM) {
            date[n] = element;
            n++;
        } else {
            System.out.println("Eroare vector!");
        }
    }

    public void afisare() {

        System.out.println("Vectorul este: ");
        for (int i = 0; i < date.length; i++) {
            System.out.print(" " + date[i]);
        }
        System.out.println();
    }

    public void extrage(int element) {
        //se verifica daca elementul de extragere exista in vector
        int index = 0;
        boolean elementExist = false;
        for (int i = 0; i < date.length; i++) {
            if (date[i] == element) {
                elementExist = true;
                index= 0;
                break;
            }
        }

        if (elementExist && n>0){
            while (index<n){
                date[index]=date[index+1];
                index++;
            }
            n--;
        }
        else {
            System.out.println("Elementul nu este in vector! ");
        }

    }
}