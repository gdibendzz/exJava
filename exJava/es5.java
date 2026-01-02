
import java.util.Scanner;

//Creare un programma che chiede un numero all'utente per poi dichiarare un array con lunghezza pari al numero inserito.
//Successivamente riempire l'array chiedendo quali numeri inserire all'utente per poi calcolarne la sommatoria

public class Es5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire un numero:");
        int numero = sc.nextInt();
        System.out.println("Numero inserito: " + numero);
        int[] array = new int[numero];
        int somma = 0;
        for(int i = 0; i < array.length; i++) {
            System.out.println("Inserire un numero per riempire l'array");
            int num = sc.nextInt();
            array[i] = num;
            somma += array[i];
        }
        System.out.println("Sommatoria: " + somma);
    }
}
