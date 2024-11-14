public class Mascota {
    public static void main(String[] args) {
        Perro Rocky = new Perro("Rocky", 5, "Chihuahua");


        Rocky.jugar("rama");
        System.out.println(Rocky.dameNombre());
        Rocky.comer();
        Rocky.ladra();

        Futbolistas miguel = new Futbolistas("Pumas", "Miguel", "Patraca", 19, 7, "defensa", 1.60, "Diestro");
        Futbolistas Erick = new Futbolistas("Pumas","Erick", "Mazaba",19,10,"Mediocentro",1.70,"Diestro");

        Erick.centro();
        miguel.dispara();
        miguel.gol();
        



    }
    
}
