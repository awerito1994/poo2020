package Taller_uno;

public class EjecutaDocente {
    public static void main(String[] args) {
        //Declaracion de las variables
        Docente docente = new Docente();
        docente.setNombre("Alex");
        docente.setFecha_nacimiento(1995);
        docente.setCorreo("alex_awuero@hotmail.com");
        docente.setEdad(20);
        docente.setSexo("Masculino");
        docente.setDireccion("Zamora");
        docente.getDocente();
        String mostrar_docente = docente.getDocente();
        System.out.println(mostrar_docente);
    }
}
