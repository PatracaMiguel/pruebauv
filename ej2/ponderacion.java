package ej2;
import java.util.Scanner;
public class ponderacion {

    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);

        System.out.println("¿Cuantas materias tuviste este semestre?");
        int cantidadMaterias = entradaDatos.nextInt();

        int creditoMaterias[] = new int[cantidadMaterias];
        double calificaciones[] = new double[cantidadMaterias];

        ingresarDatos(creditoMaterias, calificaciones, cantidadMaterias);

        System.out.println("Los resultados son");
        promedio(creditoMaterias, calificaciones, cantidadMaterias);

        entradaDatos.close();
}

public static void ingresarDatos (int arrayMaterias[],double arrayCalifiaciones[], int limiteArray){
    Scanner entrada = new Scanner(System.in);
    for(int i = 0; i < limiteArray; i++){
        System.out.print("Credito de la materia " );
        arrayMaterias[i] = entrada.nextInt();
        System.out.print("Calificacion de la materia ");
        arrayCalifiaciones[i] = entrada.nextDouble();
        }
        entrada.close();
}




public static void promedio (int arrayMaterias[],double arrayCalifiaciones[], int limiteArray){
    int totalMaterias = 0;
    double totalCalificacion = 0;
    for (int i = 0; i < limiteArray; i++){
    double resultado = arrayMaterias[i] * arrayCalifiaciones[i];
    System.out.println(arrayMaterias[i] + " x " + arrayCalifiaciones[i] + " = " + resultado);
    totalMaterias += arrayMaterias[i];
    totalCalificacion += resultado;
    }
    
    System.out.println("El promedio final es " + totalCalificacion/totalMaterias);

}

}