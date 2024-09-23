import java.util.Scanner;

public class PiramideCiclosAnidados {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int numFilas;
            
            System.out.print("Número de filas: ");
            numFilas = input.nextInt();
            
            for (int i = 1; i <= numFilas; i = i + 1) {
                for (int j = 1; j <= i; j = j + 1) {
                    System.out.println(j + " ");
                }
                System.out.println();
            }
        }
    }
}
