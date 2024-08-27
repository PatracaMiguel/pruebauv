// Programa que le pide al usuario un numero para multiplicar y el limite usando for
import java.util.Scanner;
public class TablaDeMultiplicar {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingresa el numero a multiplicar");
    int numeroDeTabla = entrada.nextInt();

    System.out.println("Ingresa hasta que numero se mulitiplicara");
    int limiteDeTabla = entrada.nextInt();

    for(int i = 1; i <= limiteDeTabla; i++){
        System.out.println( numeroDeTabla +  " * "+ i + " = " + numeroDeTabla * i );
    }
    entrada.close();

    }
}