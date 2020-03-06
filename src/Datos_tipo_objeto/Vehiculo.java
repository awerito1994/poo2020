package Datos_tipo_objeto;

public class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private String cilindraje;
    private int anio;


    public Vehiculo(String placa, String modelo, String marca, int anio, String color, String cilindraje) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
        this.color = color;
        this.cilindraje = cilindraje;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getCilindraje() {
        return cilindraje;
    }
}