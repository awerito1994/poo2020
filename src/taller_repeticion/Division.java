package taller_repeticion;
// Alexander Loja, Ricoardo Freire,Génesis Gonzáles

public class Division {
    //Definicion de atributos
    private int cociente;
    private double dividendo;
    private double divisor;
    private double residuo;
    private double divideTemp;
    private double divisoTemp;

    /**
     * Método constructor para realizar la división
     * @param dividendo
     * @param divisor
     */
    public Division(double dividendo, double divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;

    }

    /**
     * Método para calcular la solución de la divisón
     */
    public void calcularSolucion() {
        residuo = 1;
        while (residuo > 0) {
            cociente = cociente + 1;
            residuo = dividendo - divisor;
            dividendo = residuo;
        }
    }

    /**
     * Método para imprimir la solución de la división
     */
    public void obtenerCociente() {
        System.out.println(divideTemp + " / " + divisoTemp + ": " + cociente);
    }
}
