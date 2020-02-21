package deber_arreglos;

public class Estudiante {

    //Declaración de variables
    private String[] nombre = new String[5];
    private int[] edad = new int[5];
    private String[] universidad = new String[5];
    private String[] celular = new String[5];
    private String mostrar_estudiante = "";

    /**
     * Método constructor de los datos del estudiante
     * @param nombre
     * @param edad
     * @param universidad
     * @param celular
     */
    public Estudiante(String[] nombre, int[] edad, String[] universidad, String[] celular){
        this.celular = celular;
        this.edad = edad;
        this.nombre = nombre;
        this. universidad = universidad;
    }

    /**
     * Método para imprimir la salida de los datos del estudiante
     * @return cadena
     */
    public String mostrar() {
        for (int i = 0; i < 5; i++) {
            mostrar_estudiante = String.format("%sNombre: %s\nEdad: %d\nUniversidad: %s " +
                    "\nCelular: %s\n\n", nombre[i], edad[i], universidad[i], celular[i], mostrar_estudiante);
        }
        return mostrar_estudiante;
    }
}
