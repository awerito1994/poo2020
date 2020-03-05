package PolimorfismoAutomotriz;


import java.util.Scanner;

public class EjecutaEmpleado_Poli {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, departamento, puesto;
        double sueldo_mensual, precio, precio_auto,valor_autos;
        int autos_vendidos,trabajos_realizados;
        String seleccion = "";
        int cont = 0;
        int op;
        boolean menu = true;
        String cadena = "\t\t\t\t\tREPORTE DE NÓMINA QUINCENAL\nRFC\t\t\t\tNombre\t\t\tDEPTO.\t\t\tPUESTO\t\t\tSUELDO QUINCENAL\n" +
                "------------------------------------------------------------------------\n";
        do {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Elija una opción: ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("1.EMPLEADO ADMINISTRATIVO");
            System.out.println("2.EMPLEADO MECÁNICO");
            System.out.println("3.EMPLEADO VENDEDOR");
            System.out.println("4.Salir");
            System.out.println("-------------------------------------------------------------------");
            op = teclado.nextInt();
            teclado.nextLine();

            switch (op) {

                case 1:
                    cont+=1;
                    System.out.print("Ingrese el nombre del empleado: ");
                    nombre=teclado.nextLine();
                    System.out.print("Ingrese el departamento del empleado: ");
                    departamento=teclado.nextLine();
                    System.out.print("Ingrese el puesto del empleado ");
                    puesto=teclado.nextLine();
                    System.out.print("Ingrese el sueldo mensual del empleado: ");
                    sueldo_mensual=teclado.nextDouble();
                    EmpAdmvo eA = new EmpAdmvo(nombre,departamento,puesto,sueldo_mensual);
                    eA.calcularQuincena();
                    cadena = String.format("%s%3d%20s%15s%15s%15.2f\n", cadena, cont, nombre,departamento,puesto,eA.getQuincena());

                    break;
                case 2:
                    cont+=1;
                    System.out.print("Ingrese el nombre del empleado: ");
                    nombre=teclado.nextLine();
                    System.out.print("Ingrese el departamento del empleado: ");
                    departamento=teclado.nextLine();
                    System.out.print("Ingrese el puesto del empleado: ");
                    puesto=teclado.nextLine();
                    System.out.print("Ingrese cuántos trabajos realizo el empleado: ");
                    trabajos_realizados=teclado.nextInt();
                    System.out.print("Ingrese el sueldo mensual del empleado: ");
                    sueldo_mensual=teclado.nextDouble();
                    System.out.println("Ingrese el precio del trabajo: ");
                    precio=teclado.nextDouble();
                    EmpMecanico eM = new EmpMecanico(nombre,departamento,puesto,trabajos_realizados,precio);
                    eM.calcularQuincena();
                    cadena = String.format("%s%5d%20s%15s%15s%15.2f\n", cadena, cont, nombre,departamento,puesto,eM.getQuincena());
                    break;
                case 3:
                    cont+=1;
                    System.out.print("Ingrese el nombre del empleado: ");
                    nombre=teclado.nextLine();
                    System.out.print("Ingrese el departamento del empleado: ");
                    departamento=teclado.nextLine();
                    System.out.print("Ingrese el puesto del empleado: ");
                    puesto=teclado.nextLine();
                    System.out.print("Ingrese el precio del auto: ");
                    precio_auto=teclado.nextInt();
                    System.out.print("Ingrese cuantos autos vendió el empleado: ");
                    autos_vendidos=teclado.nextInt();
                    EmpVendedor eV = new EmpVendedor(nombre,departamento,puesto,precio_auto,autos_vendidos);
                    eV.calcularQuincena();
                    cadena = String.format("%s%5d%20s%15s%15s%15.2f\n", cadena, cont, nombre,departamento,puesto,eV.getQuincena());
                    break;
                case 4:
                    menu = true;
                    System.out.println("No ha elegido ninguna cuenta. Gracias.");
                    break;

                default:
                    System.out.println("Por favor ingrese la opción correcta ");
            }
            if (op == 4){
                menu = false;

            }
        }while (menu==true);
        System.out.printf("%s\nTOTAL %d DE INVERSIONES\n",cadena,cont);
    }
    }

