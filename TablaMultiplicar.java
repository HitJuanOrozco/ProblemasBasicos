import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Número para ver tabla de multiplicar: ");
        int numero = input.nextInt();
        
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        input.close();
    }
}