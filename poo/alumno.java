public class alumno {
    int id;
    String nombre;
    String apellidos;

    public alumno(){
        
    }

    public alumno(int id,String nombre,String apellidos){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;

    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public void mostrarNombre(){
        System.out.println("Hola soy un alumno y se decir mi nombre"  );
    }

    public void saberAprobado (double calificacion){
        if (calificacion >= 6){
            System.out.println("Aprobe la materia :D");
        }
        else { 
            System.out.println("No aprobe :c");
        }
    }
}

