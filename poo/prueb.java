import COIL.FiguraGeometrica;

public class prueb {
    public static void main(String[] args) {
        FiguraGeometrica fig1 = new FiguraGeometrica();

        fig1.setRelleno(true);
        fig1.setColor("rojo");

        fig1.getColor();
        fig1.getFechaCreacion();
        fig1.estaRelleno();

    
        fig1.setRelleno(true);
        fig1.setColor("rojo");
        
        System.out.println("Color: " + fig1.getColor());
        System.out.println("Fecha de creación: " + fig1.getFechaCreacion());
        System.out.println("Está relleno: " + fig1.estaRelleno());
            }
    
}
