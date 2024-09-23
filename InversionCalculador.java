import java.util.Scanner;

public class InversionCalculador {
    public static void main(String[] args) {
        // Variables para el ejercicio de inversión
        double cantidadInversion;
        double porcentajeInteres;
        double ganancias;

        Scanner input = new Scanner(System.in);

        // Pedir al usuario la cantidad de la inversión y el porcentaje de interés
        System.out.print("Ingrese la cantidad de inversión: ");
        cantidadInversion = input.nextDouble();

        System.out.print("Ingrese el porcentaje de interés: ");
        porcentajeInteres = input.nextDouble();

        // Calcular las ganancias
        ganancias = cantidadInversion * (porcentajeInteres / 100);

        // Mostrar los resultados
        System.out.println("Las ganancias son: $" + ganancias);
        input.close();
    }
}