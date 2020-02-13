package Taller_uno;

public class EjecutaVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca("Toyota");
        vehiculo.setPrecio(12000);
        vehiculo.setPeso("8 toneladas");
        vehiculo.setOrigen("China");
        vehiculo.setMaterial("Lata");
        vehiculo.getVehiculo();
        String mostrar_vehiculo = vehiculo.getVehiculo();
        System.out.println(mostrar_vehiculo);
    }
}
