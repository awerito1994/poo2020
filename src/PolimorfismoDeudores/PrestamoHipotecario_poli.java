package PolimorfismoDeudores;

public class PrestamoHipotecario_poli extends ClienteDeudor_Poli {
    private double capital;
    private double porcentaje;
    private double interes;

    /**
     * Método constructor para llamar los parámetros de la super clase
     *
     * @param nombre
     * @param num_cuenta
     * @param capital
     * @param plazo
     * @param porcentaje
     */

    public PrestamoHipotecario_poli(String nombre, String num_cuenta, double capital, int plazo, double porcentaje) {
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