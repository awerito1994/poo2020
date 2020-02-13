package Taller_uno;

public class Docente {
    private String nombre;
    private int fecha_nacimiento;
    private String correo;
    private int edad;
    private String sexo;
    private String direccion;

    /**
     * Método para obtener el nombre del docente
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para actualizar el nombre del docente
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la fecha de nacimiento del docente
     * @return
     */
    public int getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * Método para actualizar la fecha de nacimiento del docente
     * @param fecha_nacimiento
     */
    public void setFecha_nacimiento(int fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * Método para obtener el corre del docente
     * @return
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Método para actualizar el correo del docente
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Método para obtener la edad del docente
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para actualizar la edad del docente
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método para obtener el sexo del docente
     * @return
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Método para actualizar el sexo  del docente
     * @param sexo
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Método para obtener la dirección del docente
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método para actualizar la dirección del docente
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método para mostrar los datos de un docente
     * @return
     */
    public String getDocente() {
        System.out.println("Datos del docente");
        String docente = nombre + "," + "" + fecha_nacimiento + "," + correo + "," + edad + "," + sexo + "," + direccion;
        return docente;
    }
}