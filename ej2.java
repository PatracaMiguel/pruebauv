
/*Programa en java de las estructuras de control  */

import java.util.Scanner;
class estructurasDeControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa tus aciertos \t");
            int aciertosEnExamen = scanner.nextInt();
            
            System.out.print("Ingresa tus edad \t ");
            int edad = scanner.nextInt();

            if(aciertosEnExamen >= 6 && aciertosEnExamen<=10){
            System.out.print("Pasaste el examen\n ");
            }
            else{
            System.out.print("No pasaste el examen\n");
            }

            if(edad>=18){
                System.out.print("Puedes pasar por tu INE");
            }
            

            
            do{
                edad++;
                System.err.println(edad);
            } while(edad<=100);{
            System.out.println("Moriste \n");
            }
            

        
        }



    }

