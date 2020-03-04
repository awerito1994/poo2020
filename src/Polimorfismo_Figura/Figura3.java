package Polimorfismo_Figura;

public abstract class Figura3 {

    protected String nombre;
    protected double area;

    public abstract void calcularArea();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }


}


