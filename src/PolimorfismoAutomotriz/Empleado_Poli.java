package PolimorfismoAutomotriz;
//Superclase de polimorfismo de Automotriz
public  abstract class Empleado_Poli {
    //Declaración de variables
    protected String nombre;
    protected String departamento;
    protected String puesto;
    protected double quincena;

    ////Método abstracto para calcular la quincena de varios empleados
    public abstract void calcularQuincena();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getQuincena() {
        return quincena;
    }

}

