package disenio_repeticion;

public class Empleado {
    //Definición de atributos
    private String nombre;
    private int horas_tra;
    private double valor_hora;
    private double sueldo;

    /**
     * Método contructor para el sueldo del empleado
     *  @param nombre1
     * @param horas_tra
     * @param valor_hora
     */
    public  Empleado(String nombre1, int horas_tra, double valor_hora) {
        this.nombre = nombre1;
        this.horas_tra = horas_tra;
        this.valor_hora = valor_hora;
    }

    /**
     * Método para calcular el sueldo del empleado
     * @return
     */
    public double calcular_sueldo() {
        if (horas_tra <= 40) {
            sueldo = horas_tra * valor_hora;
        } else{
            sueldo = (40 * valor_hora) + (horas_tra - 40) * (valor_hora * 2);
            }
            return sueldo;
        }

    /**
     * Método para imprimir en pantalla los datos del empleado
     * @return
     */
    public String mostar(){
        String mostrar_empleado=String.format("Nombre del empleado: %s\nEl Sueldo total del empleado es  : "+"%.2f $",nombre,calcular_sueldo());
        return mostrar_empleado;
    }

    }
