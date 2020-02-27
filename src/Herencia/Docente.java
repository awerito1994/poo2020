package Herencia;

public class Docente extends Persona{

    //Atributos propios de la clase Docente

    /**
     * Constructor para la clase Docente
     * @param area
     * @param nombre
     * @param identificacion
     * @param estado_civil
     * @param fecha_nac
     */
    public Docente(String area,String nombre,String identificacion, String estado_civil, String fecha_nac){
        this.area=area;
        this.nombre=nombre;
        this.identificacion=identificacion;
        this.estado_civil=estado_civil;
        this.fecha_nac=fecha_nac;


    }
    private String area;

    public void calcularnota(){
        System.out.println("Metodo para calcular las notas");

    }
    public String getarea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
