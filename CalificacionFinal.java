
import java.util.Scanner;

public class CalificacionFinal {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double[] parciales = new double[4];
            double[] talleres = new double[2];
            double calificacionFinal = 0;
            double sumaPonderada = 0;
            int notasFaltantes = 0;
            double puntosRestantes = 2.9;
            boolean esValido;
            // Solicitar las calificaciones de los 4 parciales con validación
            for (int i = 0; i < parciales.length; i++) {
                do {
                    System.out.print("Ingrese la calificación del parcial " + (i + 1) + " (0.0 a 5.0, o -1 si no lo sabe): ");
                    parciales[i] = input.nextDouble();
                    esValido = (parciales[i] >= -1 && parciales[i] <= 5);
                    if (!esValido) {
                        System.out.println("Error: Ingrese una calificación válida entre 0.0 y 5.0, o -1 si no lo sabe.");
                    }
                } while (!esValido);
                
                if (parciales[i] != -1) {
                    calificacionFinal += parciales[i] * 0.20;
                    sumaPonderada += parciales[i] * 0.20;
                } else {
                    notasFaltantes++;  // Contar cuántas notas faltan
                }
            }   // Solicitar las calificaciones de los 2 talleres con validación
            for (int i = 0; i < talleres.length; i++) {
                do {
                    System.out.print("Ingrese la calificación del taller " + (i + 1) + " (0.0 a 5.0, o -1 si no lo sabe): ");
                    talleres[i] = input.nextDouble();
                    esValido = (talleres[i] >= -1 && talleres[i] <= 5);
                    if (!esValido) {
                        System.out.println("Error: Ingrese una calificación válida entre 0.0 y 5.0, o -1 si no lo sabe.");
                    }
                } while (!esValido);
                
                if (talleres[i] != -1) {
                    calificacionFinal += talleres[i] * 0.10;
                    sumaPonderada += talleres[i] * 0.10;
                } else {
                    notasFaltantes++;  // Contar cuántas notas faltan
                }
            }   // Verificar si faltan notas por ingresar
            if (notasFaltantes > 0) {
                double puntosFaltantes = puntosRestantes - sumaPonderada;
                if (puntosFaltantes > notasFaltantes * 5) {
                    System.out.println("\nEs imposible aprobar. Aunque saques la máxima nota en las calificaciones faltantes, no alcanzarás el puntaje necesario.");
                } else {
                    double promedioNecesario = puntosFaltantes / notasFaltantes;
                    System.out.println("\nFaltan " + puntosFaltantes + " puntos para aprobar.");
                    System.out.println("Debes sacar un promedio de " + promedioNecesario + " en las " + notasFaltantes + " notas faltantes para aprobar.");
                }
            } else {
                // Mostrar si aprobó o reprobó
                if (calificacionFinal >= 2.9) {
                    System.out.println("\nAprobó con una calificación final de: " + calificacionFinal);
                } else {
                    System.out.println("\nReprobó con una calificación final de: " + calificacionFinal);
                }
            }
            // Cerrar el Scanner
        }
    }
}