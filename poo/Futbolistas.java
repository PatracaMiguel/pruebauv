public class Futbolistas {
    String equipo;
    String nombre;
    String apellido;
    int edad;
    int dorsal;
    String posicion;
    Double estatura;
    String piernaHabil;

    public Futbolistas(String equipo, String nombre, String apellido, int edad, int dorsal,String posicion, double estatura, String piernaHabil ){
        this.equipo = equipo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad= edad;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.estatura = estatura;
        this.piernaHabil = piernaHabil;
    }

    public void pase(){
        System.out.println(nombre + " pasa el balon");
    }

    public void dispara(){
        System.out.println( nombre + " dispara al arco");
    }

    public void centro(){
        System.out.println( nombre + " tira un centro al área");
    }

    public void gol(){
        System.out.println( nombre + " Anota y lo celebra");
    }
}
