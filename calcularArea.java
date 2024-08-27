// importamos la libreria que nos ayuda a recibir valores del usuario
import java.util.Scanner;
// Creamos la clase con el nombre de la funcion
class Area{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Le pido al usuario que ingrese el area
        System.out.println("Ingresa el radio del circulo");
        //Declaro las variables como double por que representan los decimales con mayor presición que el float 
        double radio = scanner.nextDouble();
        double pi = 3.1416;
        // En este caso el area del circulo es pi*(radio)^2
        double area = (radio * radio)*pi;
        System.out.println("El area es de " + area);
        scanner.close();
    }

}


