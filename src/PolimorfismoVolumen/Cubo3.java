package PolimorfismoVolumen;

public class Cubo3 extends Figura_poli {
    //Atributos propios de la clase
    private double arista;
    private String nombre;

    //También se esxtienden los atributos de la clase
    public Cubo3(double arista, String nombre) {
        this.arista = arista;
        this.nombre = nombre;


    }

    @Override
    public void calcularVolumen() {
        volumen = (arista * arista * arista);
    }
}