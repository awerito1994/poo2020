package arreglospoo;

import java.util.Scanner;

public class EjecutaDesviacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            /*
            declaracion de variable
             */
        int [] numero = new int[10];
            /*
            obtencion de numeros
             */
        for(int i=  0; i < numero.length; i++){
            System.out.println("Ingrese el numero #"+ (1+i));
            numero[i] = entrada.nextInt();
        }
            /*
            Creacion de objeto y llamada a los objetos
             */
        Desviacion desviacion = new Desviacion(numero);
        desviacion.calcularMedia();
        desviacion.calcularDesviacion();
        desviacion.presentar();
    }
}

