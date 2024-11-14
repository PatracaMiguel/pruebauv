<<<<<<< HEAD
public class Perro {
    String nombre;
    int edad;
    String raza;


    public Perro(String nombre, int edad,String raza){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public void ladra(){
        System.out.println("GUAU GUAU");
    }

    public String dameNombre(){
        return nombre;
    }

    public void comer (){
        System.out.println("Comer ");
    }

    public void jugar (String rama){
        System.out.println("El perro sigue la " + rama);
        
    }


}
=======
package Animales;
public class Perro extends Canido {
    @Override 
    public String getAlimentos(){
        return "Perro: su alimentación es canivora";
    }

    @Override 
    public String getHabitad(){
        return "Perro: su habitad es doméstico";
    }

    @Override 
    public String getSonoido(){
        return "Perro: su sonido es ladrido";
    }

    @Override 
    public String getNombreCientifico(){
        return "Perro: Canis lupus familiaris ";
    }



}
>>>>>>> c4286c09f7d2c96b9a10f0c18ab01545854cc911
