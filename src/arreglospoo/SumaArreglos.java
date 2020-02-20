package arreglospoo;

public class SumaArreglos {
    private int[] vectorA = new int[10];
    private int[] vectorB = new int[10];
    private int[] sumaAB = new int[10];


    /*
    Asignar valores desde el constructor
     */
    public SumaArreglos(int[] vectA, int[] vectB) {
        this.vectorA = vectA;
        this.vectorB = vectB;
    }

    /*
    Metodo para calcular la sumatoria del vector A y B
     */
    public void calcularSumatoria() {
        for (int i = 0; i < vectorA.length; i++) {
            sumaAB[i] = vectorA[i] + vectorB[i];
        }
    }

    /*
    Metodo para hacer la presentacion de el Vector A y B y la suma
     */
    public void presentar() {
        System.out.print("Arreglo 1\t+\tArreglo 2\t=\t Arreglo 3");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print("\n\t" + vectorA[i] + " \t\t\t\t " + vectorB[i] + " \t\t\t\t " + sumaAB[i]);
        }

    }
}