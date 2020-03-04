package HerenciaInversionistas;

public class Pagare extends Inversionista {

    protected double capital;
    protected double interes;
    protected double porcentaje;

    /**
     *  Método constructor para llamar los parámetros de la super clase
     * @param nombre
     * @param num_cuenta
     * @param capital
     * @param plazo
     * @param porcentaje
     */
    public Pagare(String nombre, String num_cuenta, double capital, double plazo,double porcentaje) {
        this.nombre = nombre;
        this.num_cuenta = num_cuenta;
        this.capital = capital;
        this.plazo = plazo;
        this.porcentaje= porcentaje;

    }

    /**
     * Método para calcular el interés
     * @return
     */
    public double calcularInteres() {
        interes=capital* porcentaje*plazo;
        return interes;
    }
}