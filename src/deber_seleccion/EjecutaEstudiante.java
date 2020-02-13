package deber_seleccion;
import java.util.Scanner;
public class EjecutaEstudiante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declaración de variables
        String nombre;
        double calif1;
        double calif2;
        double calif3;
        double calif4;
        double promedio;
        String obversacion;

        //Entrada de datos
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre=entrada.nextLine();
        System.out.print("Ingrese  la primera calificación: ");
        calif1=entrada.nextDouble();
        System.out.print("Ingrese  la segunda calificación: ");
        calif2=entrada.nextDouble();
        System.out.print("Ingrese la tercera calificación: ");
        calif3=entrada.nextDouble();
        System.out.print("Ingrese la cuarta calificación: ");
        calif4= entrada.nextDouble();

        //Creación de nuestro objeto
        Estudiante estudiante = new Estudiante(nombre,calif1,calif2,calif3,calif4);


        System.out.println(estudiante.mostrar());
    }
}
