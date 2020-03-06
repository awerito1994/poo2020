package Datos_tipo_objeto;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        //Declaracion de variables
        int cont;
        int op, edad;
        String nombre, cedula, carrera, correo;
        Estudiante estudiante;
        Estudiante[] estudiantes = new Estudiante[3];
        Scanner teclado = new Scanner(System.in);
        boolean bandera = true;
        for (cont = 0; cont < estudiantes.length; cont++) {
            System.out.println("IINGRESO DE NUEVO ESTUDIANTE");

            System.out.println("Ingrese el nombre del estudiante: ");
            nombre = teclado.nextLine();
            System.out.println("Ingrese la cedula del estudiante: ");
            cedula = teclado.nextLine();
            System.out.println("Ingrese la edad del estudiante: ");
            edad = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Ingrese la carrera del estudiante: ");
            carrera = teclado.nextLine();
            System.out.println("Ingrese el correo del estudiante: ");
            correo = teclado.nextLine();
            Estudiante est = new Estudiante(nombre, cedula, edad, carrera, correo);
            //Asignamos al objeto est a la variable
            estudiantes[cont] = est;

        }
        System.out.println("LISTA DE ESTUDIANTES");
        System.out.println("Cedula \t\tNombre");
        int edad_acum =0;
        for (cont = 0; cont < estudiantes.length; cont++) {
            edad_acum = edad_acum+estudiantes[cont].getEdad();
            System.out.println(estudiantes[cont].getCedula()+"\t"+estudiantes[cont].getNombre());
        }
        System.out.println("EDAD PROMEDIO DE LOS ESTUDIANTES: "+(edad_acum/estudiantes.length));

        System.out.println("FIN DEL PROGRAMA");
    }
}