package HerenciaFigura;

public class Circulo extends Figuras {

    protected double radio;
    protected double area;
    protected String nombre;

    /**
     * Método constructor para el Circulo
     * @param radio
     * @param nombre
     */
    public Circulo(double radio, String nombre) {
        this.radio = radio;
        this.nombre = nombre;


    }

    /**
     * Metodo para calcular el área del circulo
     * @return
     */
    public double calcularareaCirculo() {
        area = Math.PI * (radio * radio);
        return area;

    }

    public double getRadio() {
        return radio;
    }

    public String getNombre() {
        return nombre;
    }
}