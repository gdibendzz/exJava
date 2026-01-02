//Creare un programma che stampi solo gli elementi in posizione pari di un array

public class Es3 {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 56, 78, 21, 34};
        for(int i = 0; i < array.length; i++) {
            if(i % 2 == 0)
                System.out.println("Elemento " + i + " numero: " + array[i]);
        }
    }
}