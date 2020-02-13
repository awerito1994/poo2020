package disenio;

public class Estudiante_nota {
    private String nombre;
    private String materia;
    private double primer_bimestre;
    private double segundo_bimestre;

    //constructor

    public Estudiante_nota(String nombre, String materia, double primer_bimestre, double segundo_bimestre) {
        this.nombre = nombre;
        this.materia = materia;
        this.primer_bimestre = primer_bimestre;
        this.segundo_bimestre = segundo_bimestre;
    }

    /**
     * Método para obtener las notas de los 2 bimestres
     *
     * @param primer_bimestre
     * @param segundo_bimestre
     * @return
     */
    public String obtener_calificacion(double primer_bimestre, double segundo_bimestre) {

        String calificacion;
        double suma= primer_bimestre + segundo_bimestre;
        if (suma >= 28) {
            calificacion = "Su nota es aprobada, no debe rendir supletorio";
        } else {
            calificacion = "Su nota no es aprobaba, debe  rendir supletorio";
        }
        return calificacion;

    }

    /**
     * Método para mostrar la nota del estudiante
     * @return
     */
    public String presentacion(){
        String presentacion = String.format("El alumno: %s\n" +
                        "En la materia: %s\n" +
                        "Con las notas:\nPrimer bimestre: %.2f\n" +
                        "Segundo bimestre: %.2f\n" +
                        "Nota Final: %.2f \n%s",
                nombre, materia, primer_bimestre, segundo_bimestre, primer_bimestre + segundo_bimestre,
                obtener_calificacion(this.primer_bimestre, this.segundo_bimestre));
        return presentacion;

    }
}

