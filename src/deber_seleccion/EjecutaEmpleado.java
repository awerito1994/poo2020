package deber_seleccion;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declaracion de variables
        String nombre;
        int horas_tra;
        double valor_hora;
        double sueldo;

        System.out.print("Ingrese el nombre del empleado: ");
        nombre=entrada.nextLine();
        System.out.print("Ingrese las horas trabajadas");
        horas_tra=entrada.nextInt();
        System.out.print("Ingrese el valor de la hora: ");
        valor_hora=entrada.nextDouble();

        //Creacion de nuestro objeto

        Empleado empleado = new Empleado(nombre,horas_tra,valor_hora);
        System.out.println(empleado.mostrar());

    }
}
