public class Empleado {
    private String nombre;
    private double salario;
    private int horasTrabajadas;
    
    public Empleado( String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
        this.horasTrabajadas = 0;
    }

    public void registrarHoras(int horas){
        horasTrabajadas += horas;
    }

    public double calcularSalario() {
        double pagoPorHora = salario / 160;
        double salarioFinal = salario;
    
        if (horasTrabajadas > 160) {
            int horasExtras = horasTrabajadas - 160;
            double pagoHorasExtras = horasExtras * (pagoPorHora * 1.20); // Pago con el 20% extra
            salarioFinal += pagoHorasExtras; // Añadir pago de horas extra al salario base
        }
        return salarioFinal;
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre del empleado" + nombre);
        System.out.println("El salario calculado es $" + calcularSalario());
    }

    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Miguel", 1200);
        emp1.registrarHoras(200);
        emp1.mostrarInformacion();
    }
}
