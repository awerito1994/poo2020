package HerenciaVolumen;

public class Cubo extends Volumen {
    protected double arista;
    protected double volumen;
    protected String nombre;

    /**
     * Método constructor de la figura Cubo
     *
     * @param arista
     */
    public Cubo(double arista,String nombre) {
        this.arista = arista;
        this.nombre=nombre;

    }

    /**
     * Método para calcular el volúmen del cubo
     *
     * @return
     */
    public double calcularVolumenCubo() {
        volumen = (arista * arista * arista);
        return volumen;
    }


    public double getArista() {
        return arista;
    }

    public String getNombre() {
        return nombre;
    }
}
