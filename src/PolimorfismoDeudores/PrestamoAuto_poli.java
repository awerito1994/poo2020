package PolimorfismoDeudores;

public class PrestamoAuto_poli extends ClienteDeudor_Poli {
    protected double interes;
    protected double capital;
    protected double porcentaje;

    /**
     * Método constructor para llamar los parámetros de la super clase
     *
     * @param nombre
     * @param num_cuenta
     * @param capital
     * @param plazo
     * @param porcentaje
     */
    public PrestamoAuto_poli(String nombre, String num_cuenta, double capital, int plazo, double porcentaje) {
        this.nombre = nombre;
        this.num_cuenta = num_cuenta;
        this.capital = capital;
        this.plazo = plazo;
        this.porcentaje = porcentaje;

    }

    @Override
    public void calcularInteresAPagar() {
        interes= capital * porcentaje * plazo;
        interesAPagar= interes + capital;;
    }
}