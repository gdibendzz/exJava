//Creare un programma che calcoli la media dei numeri interi (pari e dispari) poi media dei pari e media dei dispari

public class Es2 {
    public static void main(String[] args) {

        int[] numbers = {10, 33, 40, 44, 100};
        int valueMT = 0;
        int valueMP = 0;
        int valueMD = 0;
        int countPari = 0;
        int countDispari = 0;
        for(int n :numbers) {
            valueMT += n;
            if(n % 2 == 0) {
                valueMP += n;
                countPari++;
            } else {
                valueMD += n;
                countDispari++;
            }
        }
        int mediaTotale = valueMT / numbers.length;
        int mediaPari = (countPari != 0) ? valueMP / countPari : 0;
        int mediaDispari = (countDispari != 0) ? valueMD / countDispari : 0;
        System.out.println("Calcolo media dei numeri interi: " + mediaTotale);
        System.out.println("Calcolo media dei numeri pari: " + mediaPari);
        System.out.println("Calcolo media dei numeri dispari: " + mediaDispari);
    }
}