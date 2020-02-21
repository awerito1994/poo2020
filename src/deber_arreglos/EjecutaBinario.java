package deber_arreglos;

import java.util.Scanner;

public class EjecutaBinario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //Declaración de variable
        String num;

        //Entrada de datos
        System.out.print("Digite un numero: ");
        num = entrada.nextLine();

        //Creación del objeto
        Binario binario = new Binario(num);


        System.out.println("Numero en binario: "+ num);
        System.out.println("Numero  en decimal: "+binario.calcularDecimal());

    }
    }

