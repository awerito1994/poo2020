package PolimorfismoDeudores;
 //Superclase de polimorfismo deudores
public abstract class ClienteDeudor_Poli {
    protected String nombre;
    protected String num_cuenta;
    protected double capital;
    protected int plazo;
    protected double interesAPagar;

     //Método abstracto para calcular el intéres de varios deudores
    public abstract void calcularInteresAPagar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getInteresAPagar() {
        return interesAPagar;
    }
}
