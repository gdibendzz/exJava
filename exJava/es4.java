//Creare un programma che stampi l'elemento maggiore in un array

public class Es4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 40, 50, 60};
        int max = numbers[0];
        for(int n : numbers) {
            if(n > max)
                max = n;
        }
        System.out.println("L'elemento maggiore dell'array è: " + max);
    }
}  