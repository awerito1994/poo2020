package matrizpoo;


import java.util.Scanner;

public class EjecutaMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matrizA[][] = new int[3][3];
        int matrizB[][] = new int[3][3];

        for (int i = 0; i <matrizA.length; i++) {
            for (int j = 0; j <matrizB.length; j++) {
                System.out.printf("Ingrese datos a matriz A: [%d][%d]",i+1,j+1);
                matrizA[i][j]= entrada.nextInt();
                System.out.printf("Ingrese datos a matriz B:[%d][%d]",i+1,j+1);
                matrizB[i][j]=entrada.nextInt();


            }
        }
        //Creación del objeto
        Matriz matriz= new Matriz(matrizA,matrizB);
        System.out.println(matriz.mostrar(matrizA));
        System.out.println(matriz.mostrar(matrizB));
        System.out.println(matriz.mostrar(matriz.sumaMatrizC()));
  }
}
