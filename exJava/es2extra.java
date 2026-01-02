
import java.util.Scanner;

//Creare un programma che controlla se ci sono due vocali ripetute consecutivamente in una stringa

public class Es2Extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire una parola:");
        String s = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < s.length() - 1; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            if (c1 == c2 && checkVocale(c1)) {
                found = true;
                System.out.println("Trovate due vocali consecutive: " + c1 + c2);
                break;
            }
        }
    }

    public static boolean checkVocale(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}