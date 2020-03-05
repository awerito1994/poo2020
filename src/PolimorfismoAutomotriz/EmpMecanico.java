package PolimorfismoAutomotriz;

public class EmpMecanico extends Empleado_Poli {
    private double precio;
    private double trabajos_realizados;

    /**
     * Método constructor para llamar los parámetros de la super clase
     * @param nombre
     * @param departamento
     * @param puesto
     * @param precio
     * @param trabajos_realizados
     */
    public EmpMecanico(String nombre, String departamento, String puesto, double precio, double trabajos_realizados) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.precio = precio;
        this.trabajos_realizados = trabajos_realizados;
    }

    @Override
    public void calcularQuincena() {
        quincena=trabajos_realizados*precio * 0.04;
    }
}
