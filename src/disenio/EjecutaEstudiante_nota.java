package disenio;

import java.util.Scanner;

public class EjecutaEstudiante_nota {
    public static void main(String[] args) {
        //variable
        String nombre;
        String materia;
        double primer_bimestre;
        double segundo_bimestre;

        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese la materia del estudiante: ");
        materia = teclado.nextLine();
        System.out.print("Ingrese la nota del primer bimestre: ");
        primer_bimestre = teclado.nextDouble();
        System.out.print("Ingrese la nota del segundo bimestre: ");
        segundo_bimestre = teclado.nextDouble();



        //creamos el objeto
        Estudiante_nota estudiante = new Estudiante_nota(nombre, materia,primer_bimestre,segundo_bimestre);
        System.out.println(estudiante.presentacion());
    }
}
