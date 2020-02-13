package Taller_uno;

public class Universidad {
    private String nombre_estudiante;
    private String nombre_universidad;
    private String nombre_carrera;
    private String departamentos;
    private String carreras;

    /**
     * Método para obtener el nombre del estudiante
     * @return
     */
    public String getNombre_estudiante() {
        return nombre_estudiante;
    }

    /**
     * Método para actualizar el nombre del estudiante
     * @param nombre_estudiante
     */
    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    /**
     * Método para obtener el nombre de la universidad
     * @return
     */
    public String getNombre_universidad() {
        return nombre_universidad;
    }

    /**
     * Método para actualizar el nombre de la universidad
     * @param nombre_universidad
     */
    public void setNombre_universidad(String nombre_universidad) {
        this.nombre_universidad = nombre_universidad;
    }

    /**
     * Método para obtener el nombre de la carrera
     * @return
     */
    public String getNombre_carrera() {
        return nombre_carrera;
    }

    /**
     * Método para actualizar el nombre de la carrera
     * @param nombre_carrera
     */
    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }

    /**
     * Método para obtener el nombre de los departamentos de la universidad
     * @return
     */
    public String getDepartamentos() {
        return departamentos;
    }

    /**
     * Método para actualizar el nombre de los departamentos de la universidad
     * @param departamentos
     */
    public void setDepartamentos(String departamentos) {
        this.departamentos = departamentos;
    }

    /**
     * Método para obtener las carreras de la universidad
     * @return
     */
    public String getCarreras() {
        return carreras;
    }

    /**
     * Método para actualizar las carreras de la universidad
     * @param carreras
     */
    public void setCarreras(String carreras) {
        this.carreras = carreras;
    }

    public String getUniversidad() {
        System.out.println("Caracteristicas de un estudiante en la Universidad");
        String universidad = nombre_estudiante + "," + "" + nombre_universidad + "," + nombre_carrera + "," + departamentos + "," + carreras + ".";
        return universidad;
    }
}