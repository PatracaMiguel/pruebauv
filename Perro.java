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
