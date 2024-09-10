package ej2;

public class GestionDeEstudiantes {
    public static void main(String[] args) {
        Estudiantes miguel = new Estudiantes("Miguel ",17,8.5);
        Estudiantes angel = new Estudiantes("Angel ", 18, 10);
        Estudiantes marco = new Estudiantes("Marcos ", 23,9);

        System.out.println(miguel.getNombre() +"Edad "+ miguel.getEdad() +"\t"+ miguel.getCalificacion());
        System.out.println(angel.getNombre() + "Edad "+angel.getEdad() +"\t"+ angel.getCalificacion());
        System.out.println(marco.getNombre() + "Edad "+marco.getEdad() +"\t"+ marco.getCalificacion());
        
    }
    
}
