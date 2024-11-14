
package circulo;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Circulo {
    static Scanner scan= new Scanner ( System.in);
    static private DecimalFormat objDecimalFormat = new DecimalFormat("#.00");
    
    
    private static void calculadoraCirculo() {
        
       
        float radio=0;
        
        
        System.out.println("Ingrese el radio del circulo : ");
        
        radio = scan.nextFloat();
        
        System.out.println("El área del circulo es : "+objDecimalFormat.format(Math.PI*Math.pow(radio,2)) );
        System.out.println("El perimetro del circulo es :"+objDecimalFormat.format(2*Math.PI*radio) );
    }

    
    public static void main(String[] args) {
        
        calculadoraCirculo ();
        
        
        
    }
    
}
