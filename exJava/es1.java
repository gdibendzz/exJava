
import java.util.Scanner;

//Creare un programma che controlla se un numero è pari o meno

public class Es1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire un numero:");
        int number = sc.nextInt();
        if(number % 2 == 0)
            System.out.println("Il numero inserito è pari");
        else
            System.out.println("Il numero inserito è dispari");
    }
}