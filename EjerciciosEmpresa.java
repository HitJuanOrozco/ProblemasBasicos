import java.util.Scanner;

public class EjerciciosEmpresa {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Seleccione el ejercicio a ejecutar:");
            System.out.println("1. Plan de Pago");
            System.out.println("2. Cálculo de Inversión");
            int opcion = input.nextInt();
            
            switch (opcion) {
                case 1 -> ejecutarPlanDePago(input);
                case 2 -> ejecutarCalculoInversion(input);
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    // Método para ejecutar el ejercicio del Plan de Pago
    private static void ejecutarPlanDePago(Scanner input) {
        System.out.print("Ingrese el monto total de la compra: ");
        double montoCompra = input.nextDouble();

        // Calcular pagos basados en el monto
        double inversionPropia = montoCompra > 500000 ? montoCompra * 0.55 : montoCompra * 0.70;
        double prestamoBanco = montoCompra > 500000 ? montoCompra * 0.30 : 0;
        double creditoFabricante = montoCompra - (inversionPropia + prestamoBanco);
        double interesesFabricante = creditoFabricante * 0.20;

        // Mostrar resultados
        mostrarResultadosPago(inversionPropia, prestamoBanco, creditoFabricante, interesesFabricante);
    }

    // Método para mostrar los resultados del Plan de Pago
    private static void mostrarResultadosPago(double inversionPropia, double prestamoBanco, double creditoFabricante, double interesesFabricante) {
        System.out.println("Inversión propia: $" + inversionPropia);
        if (prestamoBanco > 0) {
            System.out.println("Préstamo del banco: $" + prestamoBanco);
        }
        System.out.println("Crédito al fabricante: $" + creditoFabricante);
        System.out.println("Intereses al fabricante: $" + interesesFabricante);
    }

    // Método para ejecutar el ejercicio del Cálculo de Inversión
    private static void ejecutarCalculoInversion(Scanner input) {
        System.out.print("Ingrese la cantidad de inversión: ");
        double cantidadInversion = input.nextDouble();
        
        System.out.print("Ingrese el porcentaje de interés: ");
        double porcentajeInteres = input.nextDouble();

        // Calcular ganancias
        double ganancias = cantidadInversion * (porcentajeInteres / 100);

        // Mostrar resultado
        System.out.println("Las ganancias son: $" + ganancias);
    }
}