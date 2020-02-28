package HerenciaFigura;

public class Triangulo  extends Figuras {

    protected double base;
    protected double altura;
    protected double area;
    protected String nombre;

    /**
     * Método constructor para el Triángulo
     * @param base
     * @param altura
     * @param nombre
     */
    public Triangulo(double base, double altura, String nombre) {
        this.base = base;
        this.altura = altura;
        this.nombre = nombre;


    }

    /**
     * Metodo para calcular el área del triángulo
     * @return
     */
    public double calcularareatriangulo() {
        area = (base * altura) / 2;
        return area;

    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public String getNombre() {
        return nombre;


    }
}

