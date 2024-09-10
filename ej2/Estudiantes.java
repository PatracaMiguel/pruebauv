package ej2;

public class Estudiantes {
    String nombre;
    int edad;
    double califiacion;

    public Estudiantes(){

    }

    public Estudiantes(String nombre, int edad, double califiacion){
        this.nombre = nombre;
        this.edad = edad;
        this.califiacion = califiacion;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public double getCalificacion(){
        return califiacion;
    }

    public void setCalificacion(double calificacion){
        this.califiacion = calificacion;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre: "+ nombre + "Edad " + "Califiacion "+ califiacion);
    }
    
}
