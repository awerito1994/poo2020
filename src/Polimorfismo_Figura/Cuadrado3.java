package Polimorfismo_Figura;

public class Cuadrado3 extends Figura3 {
    protected double lado;

    /**
     * Método constructor para el Cuadrado
     *
     * @param lado
     */
    public Cuadrado3(double lado) {
        this.lado = lado;

    }

    @Override
    public void calcularArea() {
        lado =lado *lado;
    }
}