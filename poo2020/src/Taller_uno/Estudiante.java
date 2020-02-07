package Taller_uno;

public class Estudiante {
    //Definición de los atributos

    private String nombre;
    private int fecha_nacimiento;
    private String correo;
    private int edad;
    private String sexo;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public int getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDireccion() {
        return direccion;
    }
    public void actualizar_nombre(String nombre){
        this.nombre=nombre;
    }
    public void actualizar_fecha_nacimiento(String nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public void actualizar_correo(String correo) {
        this.correo = correo;
    }
    public void actualizar_edad(int nombre) {
        this.edad = edad;
    }
    public void actualizar_sexo(String sexo){
        this.sexo=sexo;
    }
    public void actualizar_direccion(String direccion){
        this.direccion=direccion;
    }


}
