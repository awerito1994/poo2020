package HerenciaAutomotriz;

public class Mecanicos extends RFC {

    protected double precio;
    protected double trabajos_realizados;
    protected double mensual;

    /**
     * Método constructor para llamar los parámetros de la super clase los
     * @param nombre
     * @param departamento
     * @param puesto
     * @param precio
     * @param trabajos_realizados
     */
    public Mecanicos(String nombre, String departamento, String puesto, double precio, double trabajos_realizados){
        this.nombre=nombre;
        this.departamento=departamento;
        this.puesto=puesto;
        this.precio=precio;
        this.trabajos_realizados= trabajos_realizados;

    }

    /**
     * Claculo el valor mensual de los empleados mecánicos
     * @return
     */
    public double calcularmensual(){

        mensual = precio * trabajos_realizados;
        return mensual;

    }

    public double getPrecio() {
        return precio;
    }

    public double getTrabajos_realizados() {
        return trabajos_realizados;
    }

}
