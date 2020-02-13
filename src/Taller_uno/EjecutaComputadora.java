package Taller_uno;

public class EjecutaComputadora {
    public static void main(String[] args) {
        //creación de las variables
        Computadora computadora = new Computadora();
        computadora.actualizar_color("rojo");
        computadora.actualizar_tamaño("160");
        computadora.actualizar_piso("10");
        computadora.actualizar_marca("DELL");
        computadora.actualizar_generacion("9th generación");
        computadora.getComputadora();
        String mostrar_comptuadora = computadora.getComputadora();
        System.out.println(mostrar_comptuadora);
    }
}
