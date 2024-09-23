import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("¿Cuántas notas deseas ingresar?: ");
            
            int CantidadNotas = input.nextInt();
            double SumaNotas = 0;
            
            for (int i = 1; i <= CantidadNotas; i++) {
                System.out.print("Ingrese la nota " + i + ": ");
                double Nota = input.nextDouble();
                SumaNotas += Nota;
            }
            
            double Promedio = SumaNotas / CantidadNotas;
            System.out.println("El promedio de las notas es: " + Promedio);
        }
    }
}