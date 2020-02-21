package matrizpoo;

public class Matriz {

    private int matrizA[][] = new int[3][3];
    private int matrizB[][] = new int[3][3];
    private int matrizC[][] = new int[3][3];


    public Matriz(int matrizA[][], int matrizB[][]) {
        this.matrizA = matrizA;
        this.matrizB = matrizB;


    }

    public int[][] sumaMatrizC() {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                matrizA[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizC;
    }

    public String mostrar(int[][] Matriz) {
        String mostrar = "";
        for (int k = 0; k < matrizA.length; k++) {
            for (int c = 0; c < matrizB.length; c++) {
                mostrar = String.format("%s%d\t", mostrar, Matriz[k][c]);
            }
        }
        return mostrar;


    }

}