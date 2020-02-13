package deber_seleccion;

public class Empleado {

    private String nombre;
    private int horas_tra;
    private double valor_hora;
    private double sueldo;

    /**
     * Constructor de un empleado
     *
     * @param nombre
     * @param horas_tra
     * @param valor_hora
     */
    public Empleado(String nombre, int horas_tra,double valor_hora) {
        this.nombre = nombre;
        this.horas_tra = horas_tra;
        this.valor_hora = valor_hora;

    }

    /**
     * Método para obtener el valor del sueldo del empleado con las horas que trabaja
     * @return
     */
    public double valor_sueldo() {
        if (horas_tra <= 40) {
            sueldo = horas_tra * valor_hora;
        } else if (horas_tra > 40 && horas_tra < 50) {

            sueldo = (40 * valor_hora) + ((horas_tra - 40) * (valor_hora * 2));
        } else {
            sueldo = (40 * valor_hora) + ((10) * (valor_hora * 2)) + ((horas_tra - 50) * (valor_hora * 3));
        }
        return sueldo;

    }

    /**
     * Método para mostrar en pantalla los datos del empleado
     * @return
     */
    public String mostrar(){
        String mostrar_empleado= String.format("Nombre del empleado: %s\nEl Sueldo total del empleado es: "+"%.2f $", nombre, valor_sueldo());
        return mostrar_empleado;

    }
}