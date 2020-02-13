package Taller_uno;

public class EjecutaCelular {
    public static void main(String[] args) {
        //Creación de características de un celular
        Celular celular = new Celular();
        celular.actualizar_marca("Samsung");
        celular.actualizar_precio(100);
        celular.actualizar_camara("5");
        celular.actualizar_peso(100);
        celular.actualizar_bateria("Samsung");
        celular.getCelular();
        String mostrar_celular = celular.getCelular();
        System.out.println(mostrar_celular);
    }
}
