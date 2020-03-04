package HerenciaVolumen;

public class Cono extends Volumen {

    protected double radio;
    protected double altura;
    protected double volumen;
    protected String nombre;

    /**
     * Método contructor de la figura Cono
     * @param radio
     * @param altura
     */
    public Cono(double radio,double altura, String nombre){
        this.radio=radio;
        this.altura=altura;
        this.nombre=nombre;

    }

    /**
     * Método para calcular el volúmen del cono
     * @return
     */
    public double CalcularVolumenCono(){

        volumen =(Math.PI*(radio * radio)* altura)/3;
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
