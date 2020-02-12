package disenio_seleccion;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        String nombre;
        int horas_tra;
        double cuota_hora;
        double sueldo;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese las horas trabajadas del empleado: ");
        horas_tra = teclado.nextInt();
        System.out.println("Ingrese el valor de la horas que trabajó: ");
        cuota_hora = teclado.nextDouble();



        //Creamos el objeto
        Empleado empleado= new Empleado(nombre, horas_tra,cuota_hora);
        System.out.println(empleado.presentacion());
    }
}
