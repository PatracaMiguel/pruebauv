/*Programa que recibe un numero y muestra si es par o impar*/
import java.util.Scanner;
class HelloJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa un numero");
            int numeroEntero = scanner.nextInt();

            if (numeroEntero % 2 == 0){
                System.out.println("El numero es par");
            }
            else{
                System.out.println("El numero es impar");
            }

            scanner.close();


    }
}