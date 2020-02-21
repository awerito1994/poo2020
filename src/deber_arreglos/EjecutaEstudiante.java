package deber_arreglos;

import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declración de variables
        String[] nombre = new String[5];
        int[] edad = new int[5];
        String[] universidad = new String[5];
        String[] celular = new String[5];
        String cadenaFinal = "";

        // Entrada de datos
        for (int i = 0; i < 5; i++) {
            System.out.println("FICHA DEL ESTUDIANTE");
            System.out.println("=====================================================");
            System.out.print("Ingrese el nombre del estudiante:");
            nombre[i] = entrada.nextLine();
            System.out.print("Ingrese la edad del estudiante: ");
            edad[i] = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Ingrese la universidad del estudiante: ");
            universidad[i] = entrada.nextLine();
            System.out.print("Ingrese el numero de celular del estudiante:");
            celular[i] = entrada.nextLine();
        }
        //Creación del objeto
        Estudiante estudiante = new Estudiante(nombre, edad, universidad, celular);


        System.out.println(estudiante.mostrar());
    }

}

