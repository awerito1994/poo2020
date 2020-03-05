package PolimorfismoDeudores;

import HerenciaDeudores.PrestamoAuto;
import HerenciaDeudores.PrestamoHipotecario;
import HerenciaDeudores.PrestamoPersonal;

import java.util.Scanner;

public class EjecutaClienteDeudor_poli {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre,num_cuenta;
        double capital,porcentaje,interes;
        String seleccion = "";
        int cont = 0;
        int op, plazo;
        boolean menu = true;
        String cadena = "\t\t\t\t\tREPORTE DE CLIENTES DEUDORES\nNo. Cliente\t\t\tNombre\t\tNo. Cuenta\t\tInterés por pagar\n" +
                "------------------------------------------------------------------------\n";
        do {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Elija una opción: ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("1.PRÉSTAMO PERSONAL");
            System.out.println("2.PRÉSTAMO HIPOTECARIO");
            System.out.println("3.PRÉSTAMO AUTO");
            System.out.println("4.Salir");
            System.out.println("-------------------------------------------------------------------");
            op = teclado.nextInt();
            teclado.nextLine();

            switch (op) {

                case 1:
                    cont+=1;
                    System.out.print("Ingrese su nombre: ");
                    nombre=teclado.nextLine();
                    System.out.print("Ingrese su número de cuenta: ");
                    num_cuenta=teclado.nextLine();
                    System.out.print("Ingrese el capital prestado: ");
                    capital=teclado.nextDouble();
                    System.out.print("Ingrese el porcentaje de interés: ");
                    porcentaje=teclado.nextDouble();
                    System.out.print("Ingrese el plazo de inversión en años: ");
                    plazo=teclado.nextInt();

                    PrestamoPersonal_poli pP = new PrestamoPersonal_poli(nombre,num_cuenta,capital,plazo,porcentaje);
                    pP.calcularInteresAPagar();
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, nombre, num_cuenta
                            , pP.getInteresAPagar());

                    break;
                case 2:
                    cont+=1;
                    System.out.print("Ingrese su nombre: ");
                    nombre=teclado.nextLine();
                    System.out.print("Ingrese su número de cuenta: ");
                    num_cuenta=teclado.nextLine();
                    System.out.print("Ingrese el capital prestado: ");
                    capital=teclado.nextDouble();
                    System.out.print("Ingrese el porcentaje de interés: ");
                    porcentaje=teclado.nextDouble();
                    System.out.print("Ingrese el plazo de la inversión en años: ");
                    plazo=teclado.nextInt();
                    PrestamoHipotecario_poli pH = new PrestamoHipotecario_poli(nombre,num_cuenta,capital,plazo,porcentaje);
                    pH.calcularInteresAPagar();
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, nombre, num_cuenta
                            , pH.getInteresAPagar());
                    break;
                case 3:
                    cont+=1;
                    System.out.print("Ingrese su nombre: ");
                    nombre=teclado.nextLine();
                    System.out.print("Ingrese su número de cuenta: ");
                    num_cuenta=teclado.nextLine();
                    System.out.print("Ingrese el capital prestado: ");
                    capital=teclado.nextDouble();
                    System.out.print("Ingrese el porcentaje de interés: ");
                    porcentaje=teclado.nextDouble();
                    System.out.print("Ingrese el plazo de la inversión en años: ");
                    plazo=teclado.nextInt();

                    PrestamoAuto_poli pA = new PrestamoAuto_poli(nombre,num_cuenta,capital,plazo,porcentaje);
                    pA.calcularInteresAPagar();
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, nombre, num_cuenta
                            , pA.getInteresAPagar());
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
        System.out.printf("%s\nTOTAL %d DE CLIENTES\n",cadena,cont);
    }
    }

