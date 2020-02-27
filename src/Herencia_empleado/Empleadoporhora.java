package Herencia_empleado;

public class Empleadoporhora extends Empleado{
    /**
     * Metodo para el consturctora del empleado por hora
     * @param cuota
     * @param hora
     */
    public Empleadoporhora(String nombre,String cargo, String dependecia, double cuota, int hora){
        this.nombre=nombre;
        this.cargo=cargo;
        this.dependencia=dependecia;
        this.cuota=cuota;
        this.hora=hora;

    }
    public double calcularcuota() {
        cuota= hora * cuota;
        return cuota;
    }
    private double cuota;
    private int hora;

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}
