/*Miguel Angel Patraca Lagunes
Actividad 1 este programa es de un arreglo que a traves de metoddos se pueda encontrar el valor maximo y minimo de un arreglo ademas de imprimir
evitando repetir un mismo codigo varias veces
*/

import java.util.Scanner;
public class MetodosArreglos {
    public static void main(String [] args){
        Scanner entradaDatos = new Scanner(System.in);
        
        //Esta variable ayuda a saber el limite de numeros que el usuario desea ingresar
        System.out.println("¿Cunatos numeros tendra el arreglo?");
        int limiteArreglo = entradaDatos.nextInt();
        int array [] = new int [limiteArreglo];

        ingresarNumeros(array, limiteArreglo);

        System.out.println("Los numeros que ingresaron al arreglo son: ");
        printArray(array);

        System.out.println("El numero mayor del arreglo es:");
        findMax(array);

        
        System.out.println("El numero menor del arreglo es:");
        findMin(array);

        entradaDatos.close();
    }
    public static void findMax ( int array[]){
        //Variable temporal para que se guarde el numero mayor en ese instante
        int numeroMaximo = 0;
        for(int i = 0; i < array.length; i++){
            //Si el numero guardado en la variable temporal es menor que el array[i] entonces  array[i] pasa a ser el numeroMaximo
        if (numeroMaximo < array[i]){
            numeroMaximo = array[i];
            }
        }
    System.out.println(numeroMaximo);
    }

    public static void findMin (int array []){
        int i = 0;
        //Variable temporal que supone que el primer numero del arreglo es el minimo
        int numeroMinimo = array[i];
        for (i = 1; i < array.length; i++){
            //Si el numero guardado en la variable temporal es mayor que el array[i entonces el numero de array[i] pasa a ser el numeorMinimo 
            if (numeroMinimo > array[i]){
                numeroMinimo = array[i];
            }
        }
        System.out.println(numeroMinimo);
    }

    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }

    public static void ingresarNumeros (int array[], int limiteArray){
        Scanner datos = new Scanner(System.in);
        for(int i = 0; i < limiteArray; i++){
            System.out.println("Numero " + (i + 1));
            array[i] = datos.nextInt();
        }
        datos.close();
    }
}

