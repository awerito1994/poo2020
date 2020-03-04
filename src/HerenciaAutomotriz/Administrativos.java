package HerenciaAutomotriz;

public class Administrativos extends RFC{

     protected double sueldo_mensual;

    /**
     * MMétodo constructor para llamar los parámetros de la super clase
     * @param nombre
     * @param departamento
     * @param puesto
     * @param sueldo_mensual
     */
    public Administrativos(String nombre,String departamento, String puesto, double sueldo_mensual){
        this.nombre=nombre;
        this.departamento=departamento;
        this.puesto=puesto;
        this.sueldo_mensual=sueldo_mensual;



    }

    /**
     * Obtengo el sueldo mensual de los empleados administrativos
     * @return
     */
    public double calcularsueldo_mensual(){
        sueldo_mensual= sueldo_mensual;

         return sueldo_mensual;
    }

}
