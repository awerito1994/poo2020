package PolimorfismoInversionistas;

public class CuentaMaestra_poli extends Inversionista_poli {

    private double capital;
    private double porcentaje;

    /**
     * Método constructor para llamar los parámetros de la super clase
     *
     * @param nombre
     * @param num_cuenta
     * @param capital
     * @param plazo
     * @param porcentaje
     */
    public CuentaMaestra_poli(String nombre, String num_cuenta, double capital, int plazo, double porcentaje) {
        this.nombre = nombre;
        this.num_cuenta = num_cuenta;
        this.capital = capital;
        this.plazo=plazo;
        this.porcentaje = porcentaje;
    }

    @Override
    public void calcularInteres() {
        interes=capital* porcentaje*plazo;
    }
}