package Herencia;

public class Administrativo extends Persona{



    public Administrativo(String dependencia,String nombre,String identifcacion, String estado_civil,String fecha_nac){
        this.dependencia=dependencia;
        this.nombre=nombre;
        this.identificacion=identifcacion;
        this.estado_civil=estado_civil;
        this.fecha_nac=fecha_nac;

    }
    //Atributos propios de la clase Administrativo

    private String dependencia;



    public void gestionar_personal(){
        System.out.println("Metodo para gestionar el personal");
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
}
