// Source: https://usaco.guide/general/io

class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;
    public Triangulo() {
        super();
        this.base = 0;
        this.altura = 0;
        this.lado1 = 0;
        this.lado2 = 0;
        this.lado3 = 0;
    }
    public Triangulo(String relleno, String color, double lado1, double lado2, double lado3) {
        super(relleno, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        calcularBaseYAltura(); 
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
    public double calcularArea() {
        return (base * altura) / 2;
    }
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    @Override
    public String toString() {
        return super.toString() +
               ", Lado 1: " + lado1 +
               ", Lado 2: " + lado2 +
               ", Lado 3: " + lado3 +
               ", Base: " + base +
               ", Altura: " + altura +
               ", Área: " + calcularArea() +
               ", Perímetro: " + calcularPerimetro();
    }
