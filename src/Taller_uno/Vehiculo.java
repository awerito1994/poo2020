package Taller_uno;

public class Vehiculo {
    /**
     * Definicion de atributos
     */
    private String marca;
    private double precio;
    private String peso;
    private String origen;
    private String material;

    /**
     * Método para obtener la marca de un vehículo
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método para actualizar la marca de un vehículo
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método para obtener el precio de un vehículo
     * @return
     */

    public double getPrecio() {
        return precio;
    }

    /**
     * Método para actualizar el precio de un vehículo
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método para obtener el peso de un vehículo
     * @return
     */
    public String getPeso() {
        return peso;
    }

    /**
     * Método para actualizar el peso de un vehículo
     * @param peso
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }

    /**
     * Método para obtener el origen de un vehículo
     * @return
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Método para actualizar el origen de un vehículo
     * @param origen
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * Método para obtener el material de un vehículo
     * @return
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Método para actualizar el material de un vehículo
     * @param material
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Método para mostrar las características de un vehículo
     * @return
     */
    public String getVehiculo() {
        System.out.println("Caracteristicas de un vehiculo específico");
        String vehiculo = marca + "," + "" + precio + "," + peso + "," + origen + "," + material + ".";
        return vehiculo;
    }
}