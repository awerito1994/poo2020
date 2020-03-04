package HerenciaVolumen;

public class Esfera extends Volumen {

    protected double radio;
    protected double volumen;
    protected String nombre;

    /**
     * Método para la figura Esfera
     * @param radio
     */
    public Esfera(double radio, String nombre){
        this.radio=radio;
        this.nombre=nombre;

    }

    /**
     * Método para calcular el volúmen de la figura Cono
     * @return
     */
    public double CalcularVolumenEsfera(){
        volumen=4/3*Math.PI*(radio*radio*radio);
        return volumen;
    }

    public double getRadio() {
        return radio;
    }
    public String getNombre() {
        return nombre;
    }
}
