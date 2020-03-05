package PolimorfismoVolumen;

public class Cono3 extends Figura_poli {
    private double radio;
    private double altura;
    private String nombre;

    /**
     * Método contructor de la figura Cono
     *
     * @param radio
     * @param altura
     */
    public Cono3(double radio, double altura, String nombre) {
        this.radio = radio;
        this.altura = altura;
        this.nombre = nombre;

    }

    @Override
    public void calcularVolumen() {
        volumen =(Math.PI*(radio * radio)* altura)/3;
    }
}