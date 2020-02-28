package HerenciaFigura;

public class Rectangulo extends Figuras {

    protected double base;
    protected double altura;
    protected double area;
    protected String nombre;

    /**
     * Método constructor para el Rectángulo
     * @param base
     * @param altura
     * @param nombre
     */
    public Rectangulo(double base, double altura, String nombre) {
        this.base = base;
        this.altura = altura;
        this.nombre = nombre;

    }

    /**
     * Metodo para calcular el área del Rectángulo
     * @return
     */
    public double calcularareaRectangulo() {
        area = base * altura;
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