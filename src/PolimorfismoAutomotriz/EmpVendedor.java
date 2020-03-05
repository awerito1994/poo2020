package PolimorfismoAutomotriz;

public class EmpVendedor extends Empleado_Poli{
    private double precio_auto;
    private int autos_vendidos;

    /**
     * Método constructor para llamar los parámetros de la super clase
     * @param nombre
     * @param departamento
     * @param puesto
     * @param precio_auto
     * @param autos_vendidos
     */
    public EmpVendedor(String nombre, String departamento, String puesto,double precio_auto, int autos_vendidos) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.precio_auto = precio_auto;
        this.autos_vendidos = autos_vendidos;

    }

    @Override
    public void calcularQuincena() {
        quincena= precio_auto * autos_vendidos + 0.02;
    }
}
