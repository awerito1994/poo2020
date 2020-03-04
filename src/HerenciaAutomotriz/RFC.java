package HerenciaAutomotriz;
//Súper clase de Automotriz
public class RFC {
   //Declaración de variables
    protected String nombre;
    protected String departamento;
    protected String puesto;

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
