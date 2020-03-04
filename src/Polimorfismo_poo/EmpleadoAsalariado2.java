package Polimorfismo_poo;

public class EmpleadoAsalariado2  extends Empleado12{

    private double sueldo_mensual;

    /**
     * Método constructor
     * @param sueldo_mensual
     */
    public EmpleadoAsalariado2(double sueldo_mensual){
        this.sueldo_mensual=sueldo_mensual;

    }

    /**
     * Implementaciñon del método abstracto que fue definiido en la clase padre
     */
    @Override
    public void calcularSueldoQna() {
        sueldo = sueldo_mensual / 2;

    }
}
