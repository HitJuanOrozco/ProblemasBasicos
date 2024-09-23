import java.util.Scanner;

public class Operaciones {
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese el primer número: ");
            double Numero1 = input.nextDouble();
            
            System.out.print("Ingrese el segundo número: ");
            double Numero2 = input.nextDouble();
            
            System.out.println("Suma: " + (Numero1 + Numero2));
            System.out.println("Resta: " + (Numero1 - Numero2));
            System.out.println("Multiplicación: " + (Numero1 * Numero2));
            System.out.println("División: " + (Numero1 / Numero2));
        }
    }
}