import java.util.Scanner;

public class Pulsaciones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int Edad = input.nextInt();

        double NumPulsaciones = (220 - Edad) / 10.0;
        System.out.println("El número de pulsaciones por cada 10 segundos de ejercicio es: " + NumPulsaciones);

        input.close();
    }
}