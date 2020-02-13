package Taller_uno;

public class Estudiante {
    //Definición de los atributos

    private String nombre;
    private int fecha_nacimiento;
    private String correo;
    private int edad;
    private String sexo;
    private String direccion;

    /**
     * Método para obtener el nombre del estudiante
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener la fecha de nacimiento del estudiante
     * @return
     */
    public int getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * Método para obtener el correo del estudiante
     * @return
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Método para obtener la edad del estudiante
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para obtener el sexo del estudiante
     * @return
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Método para obtener la dirección del estudiante
     * @return
     */
    public String getDireccion() {
        return direccion;
    }
    public String getEstudiante(){
        System.out.println("Ficha del estudiante");
        String estudiante = nombre+","+""+fecha_nacimiento+","+correo+","+edad+","+sexo+"."+direccion+",";
        return estudiante;
    }
    public void actualizar_nombre(String nombre){
        this.nombre=nombre;
    }
    public void actualizar_fecha_nacimiento(int fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public void actualizar_correo(String correo) {
        this.correo = correo;
    }
    public void actualizar_edad(int edad) {
        this.edad = edad;
    }
    public void actualizar_sexo(String sexo){
        this.sexo=sexo;
    }
    public void actualizar_direccion(String direccion){
        this.direccion=direccion;
    }


}
