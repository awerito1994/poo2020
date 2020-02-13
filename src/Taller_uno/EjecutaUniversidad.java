package Taller_uno;

public class EjecutaUniversidad {
    public static void main(String[] args) {
        Universidad universidad = new Universidad();
        universidad.setNombre_estudiante("Alex");
        universidad.setNombre_universidad("UTPL");
        universidad.setNombre_carrera("Sistemas");
        universidad.setDepartamentos("Tecnología");
        universidad.setCarreras("Electrónica");
        universidad.getUniversidad();
        String mostrar_universidad = universidad.getUniversidad();
        System.out.println(mostrar_universidad);

    }
}
