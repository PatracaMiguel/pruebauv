package COIL;
public class Rectangulo {
    private double base;
    private double altura;

    
    public Rectangulo() {
        this.base = 0.0;
        this.altura = 0.0;
    }

    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

        public Rectangulo(double base, double altura, String color, boolean relleno) {
        this.base = base;
        this.altura = altura;
      
    }

    public double getBase() {
        return base;
    }

   
    public void setBase(double base) {
        this.base = base;
    }

   
    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }

   
    public double getArea() {
        return base * altura;
    }

    public double getPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "Rectangulo [base=" + base + ", altura=" + altura + ", area=" + getArea() + ", perimetro=" + getPerimetro() + "]";
    }
}
