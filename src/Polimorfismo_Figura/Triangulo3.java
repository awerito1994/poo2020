package Polimorfismo_Figura;

public class Triangulo3 extends Figura3 {
    protected double base;
    protected double altura;

    /**
     * Método constructor para el Triángulo
     * @param base
     * @param altura
     */
    public Triangulo3(double base, double altura) {
        this.base = base;
        this.altura = altura;


    }

    @Override
    public void calcularArea() {
        area = (base * altura) / 2;
    }
}
