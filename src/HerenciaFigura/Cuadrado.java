package HerenciaFigura;

public class Cuadrado extends Figuras {
    protected double lado;
    protected String nombre;

    /**
     *Método constructor para el Cuadrado
     * @param lado
     * @param nombre
     */
    public Cuadrado(double lado, String nombre) {
        this.lado=lado;
        this.nombre=nombre;

    }

    /**
     * Metodo para calcular el área del triángulo
     * @return
     */
    public double calcularareaCuadrado(){
        lado =lado *lado;
        return lado;

    }

    public double getLado() {
        return lado;
    }
    public String getNombre() {
        return nombre;
    }

}
