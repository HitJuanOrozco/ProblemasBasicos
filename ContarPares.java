public class ContarPares {

    public static void main(String[] args) {
 
        int numero = 1;
        int ContadorPares = 0;
        
        while (numero <= 50) {
            if (numero % 2 == 0) {
                ContadorPares++;
            }
            numero++;
        }
        System.out.println("La cantidad de números pares entre 1 y 50 es: " + ContadorPares);
    }
}