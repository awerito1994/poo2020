package Polimorfismo_Figura;

public class Rectangulo3 extends Figura3 {
    protected double base;
    protected double altura;

    /**
     * Método constructor para el Rectángulo
     *
     * @param base
     * @param altura
     */
    public Rectangulo3(double base, double altura) {
        this.base = base;
        this.altura = altura;


    }

    @Override
    public void calcularArea() {
        area = base * altura;
    }
}