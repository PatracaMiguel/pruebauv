public class Circulo {
    double radio;

    Circulo(){
    }

    public  Circulo(double nuevoRadio){
        radio = nuevoRadio;
    }

    double getArea(){
        return Math.PI * (radio * radio);
    }

    double perimetro(){
        return 2 * Math.PI *radio;
    }

    public void setRadio(double nuevoRadio){
        radio = nuevoRadio;
    }
}
