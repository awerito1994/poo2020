package Taller_uno;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        //Creación de características de un celular
        Estudiante estudiante = new Estudiante();
        estudiante.actualizar_nombre("Juan");
        estudiante.actualizar_fecha_nacimiento(1995);
        estudiante.actualizar_correo("juanito_2020@hotmail.com");
        estudiante.actualizar_edad(25);
        estudiante.actualizar_sexo("Masculino");
        estudiante.actualizar_direccion("Zamora");
        estudiante.getEstudiante();
        String mostrar_estudiante = estudiante.getEstudiante();
        System.out.println(mostrar_estudiante);

    }
}
