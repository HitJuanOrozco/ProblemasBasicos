import java.util.Scanner;

public class NuevoSalario {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese su salario anterior: ");
            double SalarioAnterior = input.nextDouble();
            
            double NuevoSalario = SalarioAnterior * 1.25;
            System.out.println("El nuevo salario con el incremento es: " + NuevoSalario);
        }
    }
}