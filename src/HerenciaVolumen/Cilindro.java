package HerenciaVolumen;

public class Cilindro {

    protected double altura;
    protected double radio;
    protected double volumen;
    protected String nombre;

    /**
     * Método constructor de la figura Cilindro
     *
     * @param altura
     * @param radio
     */
    public Cilindro(double altura, double radio, String nombre) {
        this.altura = altura;
        this.radio = radio;
        this.nombre = nombre;
    }

    /**
     * Método para calcular el volúmen del Cilindro
     *
     * @return
     */
    public double CalcularVolumenCilindro() {
        volumen = Math.PI * (radio * radio) * altura;
        return volumen;
    }

    public double getAltura() {
        return altura;
    }

    public double getRadio() {
        return radio;
    }

    public String getNombre() {
        return nombre;
    }
}
