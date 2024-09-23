import java.util.Scanner;

public class PresupuestoHospital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el monto presupuestal anual: ");
        double PresupuestoTotal = input.nextDouble();

        double Ginecologia = PresupuestoTotal * 0.40;
        double Pediatria = PresupuestoTotal * 0.30;
        double Traumatologia = PresupuestoTotal * 0.30;

        System.out.println("Ginecología recibirá: $" + Ginecologia);
        System.out.println("Pediatría recibirá: $" + Pediatria);
        System.out.println("Traumatología recibirá: $" + Traumatologia);

        input.close();
    }
}