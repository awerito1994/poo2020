package Taller_uno;

public class Celular {
    //Definición de atributos

    private String marca;
    private double precio;
    private String camara;
    private double peso;
    private String bateria;

    /**
     * Método para obtener la marca del celular
     * @return
     */
    public String getMarca(){
        return marca;
    }

    /**
     * Método para obtener el precio del celular
     * @return
     */

    public double getPrecio() {
        return precio;
    }

    /**
     * Método para obtener los megapixeles de la camara del celular
     * @return
     */
    public String getCamara() {
        return camara;
    }

    /**
     * Método para obtener el peso del celular
     * @return
     */

    public double getPeso() {
        return peso;
    }

    /**
     * Método para obtener la bateria del celular
     * @return
     */

    public String getBateria() {
        return bateria;
    }

    /**
     * Método para obtener las características de un celular
     * @return
     */
    public String getCelular(){
        System.out.println("Propiedades del celular");
        String celular = marca+","+""+precio+","+camara+","+peso+","+bateria+".";
        return celular;
    }

    /**
     * Método para actualizar  la marca del celular
     * @param marca
     */
    public void actualizar_marca(String marca) {
        this.marca = marca;
    }

    /**
     * Método para actualizar el precio de la marca del celular
     * @param precio
     */

    public void actualizar_precio(double precio) {
        this.precio = precio;
    }

    /**
     * Método para actualizar los megapixeles de la cámara del celular
     * @param camara
     */
    public void actualizar_camara(String camara){
        this.camara=camara;
    }

    /**
     * Método para actualizar el peso del celular
     * @param peso
     */
    public void actualizar_peso(double peso) {
        this.peso = peso;
    }

    /**
     * Método para actualizar la batería  del celular
     * @param bateria
     */
    public void actualizar_bateria(String bateria) {
        this.bateria = bateria;
    }
}
