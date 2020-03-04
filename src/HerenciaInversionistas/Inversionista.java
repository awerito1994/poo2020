package HerenciaInversionistas;
//Súper clase de los inversionistas
public class Inversionista {
    protected String nombre;
    protected String num_cuenta;
    protected double plazo;
    protected double tasa_interes;

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

    public double getPlazo() {
        return plazo;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

    public double getTasa_interes() {
        return tasa_interes;
    }

    public void setTasa_interes(double tasa_interes) {
        this.tasa_interes = tasa_interes;
    }
}
