package PolimorfismoVolumen;
//Superclase de las figuras
public abstract class Figura_poli {
    protected String nombre;
    protected double volumen;

    //////Método abstracto para calcular el volúmen de varias figuras
    public abstract void calcularVolumen();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVolumen() {
        return volumen;
    }
        
}
