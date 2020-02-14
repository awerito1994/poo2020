package taller_repeticion;
// Alexander Loja, Ricoardo Freire,Génesis Gonzáles
public class Cajero {
    //Definicion de atributos
    private double saldo;
    private double deposito;
    private double retiro;

    /**
     * Método para obtener el saldo de tu cuenta
     * @param saldo
     */
    public Cajero(double saldo){
        this.saldo=saldo;
    }

    /**
     * Método para obtener el depósito que vamos a realizar
     * @param deposito
     */
    public void Deposito(double deposito){
        this.deposito=deposito;
    }

    /**
     * Método para calcular el depósito al cajero
     */
    public void calcularDeposito(){
        saldo = deposito + saldo;
    }

    /**
     * Método para obtener el retiro del cajero
     * @param retiro
     */
    public void Retiro(double retiro){
        this.retiro = retiro;
    }

    /**
     * Método para calcular el retiro que vamos a realizar
     */
    public void calcularRetiro(){
        saldo = saldo - retiro;
    }

    /**
     * Método para obtener el saldo actual de sus retiros y depósitos
     */
    public void obtenerSaldo(){
        System.out.println("El saldo actual es: " +saldo);
    }
}
