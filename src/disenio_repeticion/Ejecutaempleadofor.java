package disenio_repeticion;

import java.util.Scanner;
//empleando ciclo de repitición for
public class Ejecutaempleadofor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int horas_tra;
        double valor_hora;
        int opcion=1;


        System.out.println("Ingrese la cuota de las horas trabajadas: ");
        valor_hora = entrada.nextInt();

        for (; opcion == 1; ) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre del empleado: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese las horas trabajadas: ");
            horas_tra = entrada.nextInt();
            Empleado empleado = new Empleado(nombre, horas_tra, valor_hora);
            empleado.calcular_sueldo();
            System.out.println(empleado.mostar());

            System.out.println("Desea calcular el sueldo de otro empleado 1.si/ 2.no: ");
            opcion = entrada.nextInt();
            if (opcion == 2) {
                opcion = 2;
            } else {
                opcion = 1;

            }

        }
    }

}