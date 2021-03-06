package HerenciaDeudores;

public class PrestamoPersonal extends ClienteDeudor{

    protected double interes;
    protected double capital;
    protected double total_pagar;
    protected double porcentaje;

    /**
     * Método constructor para llamar los parámetros de la super clase
     * @param nombre
     * @param num_cuenta
     * @param capital
     * @param plazo
     * @param porcentaje
     */
    public PrestamoPersonal(String nombre, String num_cuenta, double capital, int plazo, double porcentaje){
        this.nombre=nombre;
        this.num_cuenta=num_cuenta;
        this.capital=capital;
        this.plazo=plazo;
        this.porcentaje=porcentaje;

    }

    /**
     * Calculo el interés
     * @return
     */
    public double calcularinteres(){
        interes= capital * porcentaje * plazo;
        total_pagar= interes + capital;;
        return total_pagar;

    }
}
