package HerenciaAutomotriz;

public class Vendedores extends RFC {

    protected double precio_auto;
    protected int autos_vendidos;
    protected double valor_autos;

    /**
     * Método constructor para llamar los parámetros de la super clase
     * @param nombre
     * @param departamento
     * @param puesto
     * @param precio_auto
     * @param autos_vendidos
     */
    public Vendedores(String nombre, String departamento, String puesto,double precio_auto, int autos_vendidos){
        this.nombre=nombre;
        this.departamento=departamento;
        this.puesto=puesto;
        this.precio_auto=precio_auto;
        this.autos_vendidos= autos_vendidos;
    }

    /**
     * Calculo el precio de los autos vendidos
     * @return
     */
    public double calcularvalorautos(){

        valor_autos= autos_vendidos *precio_auto;
        return valor_autos;
    }

    public double getPrecio_auto() {
        return precio_auto;
    }

    public double getAutos_vendidos() {
        return autos_vendidos;
    }

    public double getValor_autos() {
        return valor_autos;
    }
}
