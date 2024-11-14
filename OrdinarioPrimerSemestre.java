public class OrdinarioPrimerSemestre {
    public static void main(String [] args){
        int array [] = { 5 , 10 ,15, 20,25,20,35,40};
        int arrayPar [] = new int[10];
        int arrayImpar [] = new int [10];
        int contadorPar = 0;
        int contadorImpar = 0;

        for(int i = 0; i < array.length ; i++){
            if (array [i] % 2 == 0){
                arrayPar[contadorPar] = array[i];
                contadorPar++;
            }
            else { 
                arrayImpar[contadorImpar] = array[i];
                contadorImpar++;
            }
        }
        System.out.println("Los pares son");
        imprimirArreglo(arrayImpar);
        System.out.println("Los impares son");
        imprimirArreglo(arrayPar);
        
        
    }
    
    

    public static void imprimirArreglo(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}

