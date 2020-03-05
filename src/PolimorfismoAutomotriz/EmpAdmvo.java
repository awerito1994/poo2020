package PolimorfismoAutomotriz;

public class EmpAdmvo extends Empleado_Poli {

    private double sueldo_mensual;

    /**
     * Método constructor para llamar los parámetros de la super clase
     *
     * @param nombre
     * @param departamento
     * @param puesto
     * @param sueldo_mensual
     */
    public EmpAdmvo(String nombre, String departamento, String puesto, double sueldo_mensual) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.sueldo_mensual = sueldo_mensual;

    }

    @Override
    public void calcularQuincena() {
        quincena=sueldo_mensual/2;
    }
}