import java.util.Scanner;

public class PerimetroTriangulo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese la longitud del lado del triángulo equilátero: ");
            double Lado = input.nextDouble();
            
            double Perimetro = 3 * Lado;
            System.out.println("El perímetro del triángulo equilátero es: " + Perimetro);
        }
    }
}