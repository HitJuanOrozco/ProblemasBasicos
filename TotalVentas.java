import java.util.Scanner;

public class TotalVentas {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("¿Cuántos productos has vendido?: ");
            
            int CantidadProductos = input.nextInt();
            double TotalVentas = 0;
            
            for (int i = 1; i <= CantidadProductos; i++) {
                System.out.print("Ingrese el precio del producto " + i + ": ");
                double PrecioProducto = input.nextDouble();
                TotalVentas += PrecioProducto;
            }
            System.out.println("El total de ventas es: $" + TotalVentas);
        }
    }
}