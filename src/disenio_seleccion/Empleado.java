package disenio_seleccion;

public class Empleado {
    private String nombre;
    private int horas_tra;
    private double cuota_hora;
    private double sueldo;

    //Hacemos un metodo contructor
    public Empleado(String nombre, int horas_tra, double cuota_hora) {
        this.nombre = nombre;
        this.horas_tra = horas_tra;
        this.cuota_hora = cuota_hora;


    }

    /**
     * Metodo para calcular el valor de las horas trabajadas del empleado
     *
     * @param horas_tra
     * @param cuota_hora
     * @return
     */
    public double calcular_sueldo(int horas_tra, double cuota_hora) {
        double salario;
        if (horas_tra <= 40) {
            salario = horas_tra * cuota_hora;
        } else {
            salario = (40 * cuota_hora) + (horas_tra - 40) + (cuota_hora * 2);
        }
        return salario;

    }
    public String presentacion(){
        String  presentacion = String.format("El nombre del empleado es: %s\n"+
                "Con las horas trabajadas:%s\n"+
                "Con un valor de las horas trabajadas;%s\n" +
                "El sueldo del empleado es:\n%s",
                nombre,horas_tra,cuota_hora,calcular_sueldo(this.horas_tra,this.cuota_hora));
        return presentacion;
    }


}
