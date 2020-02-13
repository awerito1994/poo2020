package Taller_uno;

public class Computadora {
    //Definicion de atributos

    private String color;
    private String tamaño;
    private String piso;
    private String marca;
    private String generacion;


    /**
     * Método para obtener la generación de la computadora
     * @return
     */
    public String getGeneracion() {
        return generacion;
    }

    /**
     * Método para obtener el color de la computadora
     * @return
     */
    public String getColor() {

        return color;
    }

    /**
     * Método para obtener la marca de la computadora
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método para obtener el piso de la computadora
     * @return
     */
    public String getPiso() {

        return piso;
    }

    /**
     * Método para obtener las características de la computadora
     * @return
     */
    public String getComputadora() {
        System.out.println("Caracteristicas de una computadora");
        String computadora= color + "," + "" + tamaño + "," + piso + "," + marca + "," + generacion + ".";
        return computadora;
    }


    /**
     * Método para actualizar el color de la computadora
     * @param color
     */
    public void actualizar_color(String color){
        this.color=color;
    }

    /**
     * Método para actualizar el tamaño de la computadora
     * @param tamaño
     */
    public void actualizar_tamaño(String tamaño){
        this.tamaño=tamaño;
    }

    /**
     * Método para actualizar el piso de la computadora
     * @param piso
     */
    public void actualizar_piso(String piso){
        this.piso=piso;
    }

    /**
     * Método para actualizar la marca de la computadora
     * @param marca
     */
    public void actualizar_marca(String marca){
        this.marca=marca;
    }

    /**
     * Método para actualizar la generación de la computadora
     * @param generacion
     */
    public void actualizar_generacion(String generacion) {
    }
}
