
import java.util.Scanner;

//Controllare se una stringa è palindroma

public class Es1Extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire una parola:");
        String word = sc.nextLine();
        word = word.toLowerCase();
        boolean isPalindroma = true;
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindroma = false;
                break;
            }
        }

        if(isPalindroma)
            System.out.println("La stringa è palindroma");
        else
            System.out.println("La stringa non è palindroma");
        
    }
}