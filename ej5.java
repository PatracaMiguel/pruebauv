import java.util.Scanner;
public class ej5 {
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa numeros positivos para sumar");
    int suma = 0;
    int numero = scanner.nextInt();
    while (numero >= 0 ){
        suma+=numero;
        numero = scanner.nextInt();
    }
    System.out.print("La suma de todos los numeros es " + suma);
    scanner.close();
    }
}
