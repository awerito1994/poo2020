package Herencia_empleado;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {


        Scanner teclado=new Scanner(System.in);
        String nombre, cargo, dependencia;
        int hora;
        double cuota,valor_mensual;
        boolean menu=true;
        String seleccion= "";
        int op;
        do{
            System.out.println("ELIJA EL EMPLEADO QUE DESEE CALCULAR SU SUELDO: ");
            System.out.println("====================================================================");
            System.out.println("1.Empleado por horas trabajadas: ");
            System.out.println("2.Empleado por asalariados: ");
            System.out.println("3.Salir");
            System.out.println("====================================================================");
            op=teclado.nextInt();
            teclado.nextLine();

            switch (op){
                case 1:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Ingrese el nombre del empleado: ");
                    nombre=teclado.nextLine();
                    System.out.println("Ingrese el cargo del empleado: ");
                    cargo=teclado.nextLine();
                    System.out.println("Ingrese la dependencia del empleado: ");
                    dependencia=teclado.nextLine();
                    System.out.println("Ingrese las horas trabajadas del empleado: ");
                    hora=teclado.nextInt();
                    System.out.println("Ingrese el valor de las horas trabajadas: ");
                    cuota=teclado.nextDouble();

                    //Creacion del objeto
                    Empleadoporhora emple = new Empleadoporhora(nombre,cargo,dependencia,cuota,hora);
                    System.out.println("====================================================");
                    System.out.println("DATOS DEL EMPLEADO POR HORA");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("Nombre: "+emple.getNombre());
                    System.out.println("Cargo: "+emple.getCargo());
                    System.out.println("Dependencia: "+emple.getDependencia());
                    System.out.println("Sueldo total: "+emple.calcularcuota());
                     break;

                case 2:
                    System.out.println("Ingrese el nombre del empleado: ");
                    nombre=teclado.nextLine();
                    System.out.println("Ingrese el cargo del empleado: ");
                    cargo=teclado.nextLine();
                    System.out.println("Ingrese la dependencia del empleado: ");
                    dependencia=teclado.nextLine();
                    System.out.println("Ingrese el valor mensual del empleado: ");
                    valor_mensual=teclado.nextDouble();
                    //Creacion del objeto
                    EmpleadosAsalariados emplea= new EmpleadosAsalariados(nombre,cargo,dependencia,valor_mensual);
                    System.out.println("====================================================");
                    System.out.println("DATOS DEL EMPLEADO ASALARIADO");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("Nombre: "+emplea.getNombre());
                    System.out.println("Cargo: "+emplea.getCargo());
                    System.out.println("Dependencia: "+emplea.getDependencia());
                    System.out.println("Sueldo total: +$ "+emplea.getValor_mensual());
                    break;
                case 3:
                    menu = true;
                    System.out.println("No ha elegido a ningun empleado. Gracias por su visita.");
                    break;
                default:
                    System.out.println("Por favor ingrese la opción correcta");

            }
        }while (menu==false);

    }
}
