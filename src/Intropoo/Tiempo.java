package Intropoo;

public class Tiempo {
    //Definición de atributos

    private int hora;
    private int minuto;
    private int segundo;

    /**
     * Método para obtener la variable hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * Método para obtener la variable minuto
     *
     * @return
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * Método para obtener la variable segundo
     *
     * @return
     */
    public int getSegundo() {
        return segundo;
    }

    /**
     * Método para obtener el tiempo
     *
     * @return
     */
    public String getTiempo() {
        String tiempo = hora + ":" + minuto + ":" + segundo;
        return tiempo;
    }

    /**
     * Método para actualizar la hora
     *
     * @param hora
     */
    public void actualizar_hora(int hora) {
        this.hora = hora;
    }

    /**
     * Método para actualizar el minuto
     *
     * @param minuto
     */
    public void actualizar_minuto(int minuto) {
        this.minuto = minuto;
    }

    /**
     * Método para actualizar el segundo
     *
     * @param segundo
     */
    public void actualizar_segundo(int segundo) {
        this.segundo = segundo;
    }
}


