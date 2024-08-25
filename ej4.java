import java.util.Scanner;
public class ej4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String contraseña = "LoveCats";
        System.out.println("Ingresa la contraseña para ingresar");

        String usuario = scanner.nextLine();
        
        while (!usuario.equals(contraseña) ){
            System.out.println("Contraseña incorrecta \n intentalo de nuevo");
            usuario = scanner.nextLine();
        }
        if (usuario.equals(contraseña)){
            System.out.println("Ingresaste correctamente");
        }

        scanner.close();
    }
}
