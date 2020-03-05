package PolimorfismoInversionistas;
//Superclase de polimorfismo
public abstract class Inversionista_poli {
    //Declaración de variables
    protected String nombre;
    protected String num_cuenta;
    protected int plazo;
    protected double interes;

    //Método abstracto para calcular el interés de varios inversionistas
    public abstract void calcularInteres();

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

    public double getInteres() {
        return interes;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
}
