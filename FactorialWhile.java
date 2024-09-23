import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Número para calcular su factorial: ");
        int numero = input.nextInt();

        int factorial = 1;
        int i = 1;

        while (i <= numero) {
            factorial *= i;
            i = i + 1;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
        input.close();
    }
}