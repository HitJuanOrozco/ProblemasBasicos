import java.util.Scanner;

public class ContarParesEntrada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio, fin;

        System.out.print("Ingrese el número inicial del rango: ");
        inicio = input.nextInt();

        System.out.print("Ingrese el número final del rango: ");
        fin = input.nextInt();

        int numero = inicio;
        int contadorPares = 0;

        while (numero <= fin) {
            if (numero % 2 == 0) {
                contadorPares++;
            }
            numero++;
        }

        System.out.println("La cantidad de números pares entre " + inicio + " y " + fin + " es: " + contadorPares);

        input.close();
    }
}