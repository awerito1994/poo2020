package Herencia;
/**
 * Clase principal o superclase
 */

import java.util.Date;
public class Persona {

    //Atributos comunes para toda slas clases
    protected String nombre;
    protected String identificacion;
    protected  String estado_civil;
    protected  String fecha_nac;



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nac = fecha_nacimiento;
    }


    }

