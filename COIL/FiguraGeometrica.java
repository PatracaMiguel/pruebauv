package COIL;
import java.util.Date;

public class FiguraGeometrica {
    private String color;
    private boolean relleno;
    private Date fechaCreacion;
    
    FiguraGeometrica(){
        this.color = "blanco";
        this.relleno = false;
        this.fechaCreacion = new Date(0) ;

    }
    FiguraGeometrica(String color, boolean relleno){
        this.color = color;
        this.relleno = relleno;
        this.fechaCreacion = new Date(0);
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean estaRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno){
        this.relleno = relleno;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica [toString()=" + super.toString() + "]";
    }

    
}
