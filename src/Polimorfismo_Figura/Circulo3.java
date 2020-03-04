package Polimorfismo_Figura;

public class Circulo3 extends Figura3{

    protected double radio;

    /**
     * Método constructor para el Circulo
     * @param radio
     */
    public Circulo3(double radio) {
        this.radio = radio;

    }

    @Override
    public void calcularArea() {
        area = Math.PI * (radio * radio);
    }
}
