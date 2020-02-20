package arreglospoo;

import java.util.Arrays;

public class Array {

    private int []vectorA = new int[10];
    private int [] vectorB = new int[10];
    private int suma_producto;

    /**
     * Método constructor de la clase
     * @param vectorA
     * @param vectorB
     */

    public Array(int[] vectorA, int[] vectorB){
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }

    public int calcular_producto(){
        suma_producto = 0;
        for (int i = 0; i < vectorA.length; i++) {
            suma_producto = suma_producto + (vectorA[i] * vectorB[i]);
        }
        return suma_producto;
    }

    public void mostrar(){
        System.out.println("VectorA: "+Arrays.toString(vectorA)+"\nVectorB: "
                + Arrays.toString(vectorB) + "\nSuma total: "+ calcular_producto());
    }
}

