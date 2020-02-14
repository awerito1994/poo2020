package deber_seleccion;

public class Estudiante {
    private String nombre;
    private double calif1;
    private double calif2;
    private double calif3;
    private double calif4;
    private double promedio;
    private String observacion;

    /**
     * Método constructor para el estudiante
     *
     * @param nombre
     * @param calif1
     * @param calif2
     * @param calif3
     * @param calif4
     */
    public Estudiante(String nombre, double calif1, double calif2, double calif3, double calif4) {
        this.nombre = nombre;
        this.calif1 = calif1;
        this.calif2 = calif2;
        this.calif3 = calif3;
        this.calif4 = calif4;
    }

    /**
     * Método para obtener el promedio de las 4 notas del estudiante
     * @return
     */
    public double suma_promedio() {
        promedio=(calif1+calif2+calif3+calif4)/4;
        return promedio;
    }

    /**
     * Método para verficar si el alumno es aprobado o no
     * @return
     */
    public String actualizar_observacion(){
        if (promedio>=60){
            observacion = "Aprobado";
        }else {
            observacion = "No Aprobado";
        }
        return observacion;
    }

    /**
     * Método para mostrar en pantalla los datos del estudiante
     * @return
     */
    public String mostrar(){
        String mostrar_estudiante=String.format("Nombre del estudiante: %S\nPromedio del estudiante: %.2f \n" +
                "Observacion: %s", nombre, suma_promedio(), actualizar_observacion());
        return mostrar_estudiante;
    }


}