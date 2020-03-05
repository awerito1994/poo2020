package PolimorfismoVolumen;

public class Esfera3 extends Figura_poli {
    private double radio;
    private String nombre;

    /**
     * Método para la figura Esfera
     *
     * @param radio
     */
    public Esfera3(double radio, String nombre) {
        this.radio = radio;
        this.nombre = nombre;

    }

    @Override
    public void calcularVolumen() {
        volumen=4/3*Math.PI*(radio*radio*radio);
    }
}