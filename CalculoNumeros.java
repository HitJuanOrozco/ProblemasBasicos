import java.util.Scanner;

public class CalculoNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double Numero = input.nextDouble();

        double Cuadrado = Math.pow(Numero, 2);
        double Cubo = Math.pow(Numero, 3);
        double Suma = Cuadrado + Cubo;

        System.out.println("Número: " + Numero);
        System.out.println("Cuadrado: " + Cuadrado);
        System.out.println("Cubo: " + Cubo);
        System.out.println("Suma del cuadrado y el cubo: " + Suma);

        input.close();
    }
}