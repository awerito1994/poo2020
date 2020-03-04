package HerenciaAutomotriz;

import Herencia.Administrativo;
import HerenciaFigura.Triangulo;

import java.util.Scanner;

public class EjecutaRFC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre, departamento, puesto;
        double sueldo_mensual, precio, mensual, precio_auto,valor_autos;
        int autos_vendidos,trabajos_realizados;
        String seleccion = "";
        int op;
        boolean menu = true;

        do {
            System.out.println("ELIJA EL TIPO DE EMPLEADO DE LA AUTOMOTRIZ");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("1.Administrativos");
            System.out.println("2.Mecánicos");
            System.out.println("3.Vendedores");
            System.out.println("4.Salir");
            System.out.println("-------------------------------------------------------------------");
            op = teclado.nextInt();
            teclado.nextLine();

            switch (op) {

                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    nombre=teclado.nextLine();
                    System.out.print("Ingrese en que departamento se encuentra el empleado: ");
                    departamento=teclado.nextLine();
                    System.out.print("Ingrese el puesto del empleado: ");
                    puesto=teclado.nextLine();
                    System.out.print("Ingrese el sueldo mensual del empleado: ");
                    sueldo_mensual=teclado.nextDouble();

                    Administrativos admi = new Administrativos(nombre,departamento,puesto,sueldo_mensual);
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Nombre del empleado: "+admi.getNombre());
                    System.out.println("Departamento del empleado: "+admi.getDepartamento());
                    System.out.println("Puesto del empleado: "+admi.getPuesto());
                    System.out.println("El sueldo mensual del empleado es: "+ "$"+admi.sueldo_mensual);
                    System.out.println("-------------------------------------------------------------------");

                    break;
                case 2:
                    System.out.print("Ingrese el nombre del empleado: ");
                    nombre=teclado.nextLine();
                    System.out.print("Ingrese en que departamento se encuentra el empleado: ");
                    departamento=teclado.nextLine();
                    System.out.print("Ingrese el puesto del empleado: ");
                    puesto=teclado.nextLine();
                    System.out.print("Ingrese el precio que cobra el empleado: ");
                    precio=teclado.nextDouble();
                    System.out.print("Ingrese cuantos trabajos ha realizado: ");
                    trabajos_realizados=teclado.nextInt();

                    Mecanicos meca = new Mecanicos(nombre,departamento,puesto,precio,trabajos_realizados);
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Nombre del empleado: "+meca.getNombre());
                    System.out.println("Departamento del empleado: "+meca.getDepartamento());
                    System.out.println("Puesto del empleado: "+meca.getPuesto());
                    System.out.println("El sueldo mensual del empleado es: "+ "$"+meca.calcularmensual());
                    System.out.println("-------------------------------------------------------------------");

                    break;
                case 3:
                    System.out.print("Ingrese el nombre del empleado: ");
                    nombre=teclado.nextLine();
                    System.out.print("Ingrese en que departamento se encuentra el empleado: ");
                    departamento=teclado.nextLine();
                    System.out.print("Ingrese el puesto del empleado: ");
                    puesto=teclado.nextLine();
                    System.out.print("El costo del auto es: ");
                    precio_auto=teclado.nextDouble();
                    System.out.print("¿Cuántos autos desea comprar?: ");
                    autos_vendidos=teclado.nextInt();

                    Vendedores vende = new Vendedores(nombre,departamento,puesto,precio_auto,autos_vendidos);
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Nombre del empleado: "+vende.getNombre());
                    System.out.println("Departamento del empleado: "+vende.getDepartamento());
                    System.out.println("Puesto del empleado: "+vende.getPuesto());
                    System.out.println("El valor total que vendió de los carros son:  "+ "$"+vende.calcularvalorautos());
                    System.out.println("-------------------------------------------------------------------");
                    break;
                case 4:
                    menu = true;
                    System.out.println("No ha elegido ningún empleado. Gracias por su visita.");
                    break;

                default:
                    System.out.println("Por favor ingrese la opción correcta ");
            }
            if (op == 4){
                menu = false;

            }
        }while (menu==true);
    }
}