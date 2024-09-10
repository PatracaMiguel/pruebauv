public class prueba {

    public static void main(String[] args){

        alumno alu1 = new alumno();
        alumno alu2 = new alumno(23017349 , " Miguel Angel" , " Patraca Lagunes");

        System.out.println(alu2.getId() + alu2.getNombre() + alu2.getApellidos());

        alu1.mostrarNombre();
        alu1.saberAprobado(10);
        alu1.setId(453);
        alu1.setNombre(" Rocky");
        alu1.setApellidos(" Lopez Perez");
        System.out.println(alu1.getId() + alu1.getNombre() + alu1.getApellidos());


        alu2.setId(96);

        System.out.println(alu2.getId() + alu2.getNombre() + alu2.getApellidos());

        Profesor maestro_miguel = new Profesor();
        maestro_miguel.setHoras(8);
        System.out.println(maestro_miguel.getHoras());


    }
    
}
