public class TV {
    int canal;
    int volumen;
    boolean encendido;

    //Constructor
    public TV(){
        canal = 1;
        volumen = 1;
        encendido = false;
    }

    //Metodos
    public void Encender (){
        if (encendido == false){
            encendido = true;
        System.out.println("La TV esta encendida");
        }
        else{
            System.out.println("La TV ya esta encendida");
        }
    }


    public void apagar(){
        if (encendido == true){
        encendido = false;
        System.out.println("La TV esta apagada");
        }
        else{
        System.out.println("La TV ya esta apagada");
        }
    }


    public void setCanal (int canal){
        int canalActual = canal;
        if (encendido == true ){
            if ( canal >=1 && canal <=120){
                this.canal = canal;
            }
        }
        else {
            System.out.println("El canal no existe");
            canal = canalActual;
        }
    }


    public void setVolumen (int volumen){
        if (encendido == true ){
            if (volumen >=1 && volumen <=100){
                this.volumen = volumen;
            }
            else {
                System.out.println("Número de volumen invalido");
            }
        } else {
            System.out.println("La TV esta apagada");
        }
    }


    public void subirCanal (){
        if (encendido == true){
            if (canal <=120){
                canal++;
            }
            else {
                System.out.println("No es posible subir más de canal ");
            }
        } else {
            System.out.println("La TV esta apagada");
        }
    }


    public void bajarCanal (){
        if (encendido == true){
            if (canal >=1){
                canal--;
            }
            else {
                System.out.println("No es posible bajar más de canal ");
            }
        } else {
            System.out.println("La TV esta apagada");
        }
    }


    public void subirVolumen (){
        if (encendido == true){
            if (volumen <= 100){
                volumen++;
            }
            else {
                System.out.println("No es posible subir más el volumen  ");
            }
        } else {
            System.out.println("La TV esta apagada");
        }
    }


    public void bajarVolumen (){
        if (encendido == true){
            if (volumen <= 1){
                volumen--;
            }
            else {
                System.out.println("No es posible bajar más el volumen  ");
            }
        } else {
            System.out.println("La TV esta apagada");
        }
    }

    public static void main(String[] args) {
        TV tele1 = new TV();
        tele1.apagar();
        tele1.subirCanal();
    
    }
}


