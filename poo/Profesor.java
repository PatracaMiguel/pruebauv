
public class Profesor extends alumno{
    String materia;
    double sueldo;
    int horas;

    public Profesor(){

    }

    public Profesor(String materia, double sueldo , int horas , int id , String nombre , String apellidos){
        super(id, nombre, apellidos);
        this.materia = materia;
        this.sueldo = sueldo;
        this.horas = horas;
    }
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia){
        this.materia = materia;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas){
        this.horas = horas;
    }
}
