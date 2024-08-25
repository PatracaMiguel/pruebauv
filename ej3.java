/*Programa que recibe 3 numeros enteros y muestra cual es el mayor */

/*Importammos el scanner para recibir valores en java  */
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa 3 numeros aleatorios");
        int primerNumero = scanner.nextInt();
        int segundoNumero = scanner.nextInt();
        int tercerNumero = scanner.nextInt();

        if(primerNumero > segundoNumero && primerNumero > tercerNumero){
            System.out.println("El numero mayor es " + primerNumero);
        } 
        if (segundoNumero > tercerNumero && segundoNumero > primerNumero){
            System.out.print("El numero mayor es " + segundoNumero);
        }
        if (tercerNumero > primerNumero && segundoNumero < tercerNumero){
            System.out.print("El numero mayor es " + tercerNumero);
        }


        scanner.close();
    }
}
