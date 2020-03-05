package PolimorfismoVolumen;

public class Cilindro3 extends Figura_poli {
    //Atributos propios de la clase
    private double altura;
    private double radio;
    private String nombre;

    /**
     * Método constructor de la figura Cilindro
     *
     * @param altura
     * @param radio
     */
    public Cilindro3(double altura, double radio, String nombre) {
        this.altura = altura;
        this.radio = radio;
        this.nombre = nombre;
    }


    @Override
    public void calcularVolumen() {
        volumen = Math.PI * (radio * radio) * altura;
    }
}

