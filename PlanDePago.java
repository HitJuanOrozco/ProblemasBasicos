
import java.util.Scanner;

public class PlanDePago {

    public static void main(String[] args) {
        // Declaración de variables
        double montoCompra;
        double inversionPropia, prestamoBanco, creditoFabricante, interesesFabricante;
        Scanner input = new Scanner(System.in);

        // Leer el monto de la compra
        System.out.print("Ingrese el monto total de la compra: ");
        montoCompra = input.nextDouble();

        // Calcular los pagos según el monto
        if (montoCompra > 500000) {
            inversionPropia = montoCompra * 0.55;
            prestamoBanco = montoCompra * 0.30;
            creditoFabricante = montoCompra * 0.15;
        } else {
            inversionPropia = montoCompra * 0.70;
            prestamoBanco = 0;
            creditoFabricante = montoCompra * 0.30;
        }

        interesesFabricante = creditoFabricante * 0.20;

        // Mostrar los resultados
        System.out.println("Inversión propia: $" + inversionPropia);
        if (prestamoBanco > 0) {
            System.out.println("Préstamo del banco: $" + prestamoBanco);
        }
        System.out.println("Crédito al fabricante: $" + creditoFabricante);
        System.out.println("Intereses a pagar al fabricante: $" + interesesFabricante);
    }
}