package arreglospoo;

import java.util.Scanner;

public class EjecutaSumaArreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] vectorA = new int[10];
        int [] vectorB = new int[10];
            /**
            Obtencion de valores vector A
             */
        for(int i=  0; i < vectorA.length; i++){
            System.out.println("Ingrese valor vector A #"+ (1+i));
            vectorA[i] = entrada.nextInt();
        }
            /*
            Obtencion de valores vector B
             */
        for(int i = 0; i < vectorB.length; i++){
            System.out.println("Ingrese valor vector B #"+ (1+i));
            vectorB[i] = entrada.nextInt();
        }
            /*
            Llamada de los metodos de la clase SumaArreglo
             */
        SumaArreglos sumaArreglo = new SumaArreglos(vectorA, vectorB);
        sumaArreglo.calcularSumatoria();
        sumaArreglo.presentar();
    }
    }

