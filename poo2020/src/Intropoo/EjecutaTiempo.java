package Intropoo;

public class EjecutaTiempo {
    public static void main(String[] args) {
        // creación de objetos de tiempo
        Tiempo tiempo = new Tiempo();
        tiempo.actualizar_hora(10);
        tiempo.actualizar_minuto(51);
        tiempo.actualizar_segundo(35);
        tiempo.getTiempo();
        String mostrar_tiempo = tiempo.getTiempo();
        System.out.println(mostrar_tiempo);
    }
}
