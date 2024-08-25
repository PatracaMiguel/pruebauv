import java.util.Scanner;
public class ej6 {
    public static void main (String[]args ){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa un numero entero");
    int contadorDeDigitos = 0;
    int numeroEntero = scanner.nextInt();
    int numeroDivisible = numeroEntero;
    do {
        numeroDivisible = numeroDivisible / 10;
        contadorDeDigitos++;
    } while (numeroDivisible > 0);

    System.out.print("El numero " + numeroEntero);
    System.out.print(" \n Tiene  "+ contadorDeDigitos);

    scanner.close();
    }
    
}
