package HerenciaInversionistas;

import HerenciaAutomotriz.Administrativos;
import HerenciaAutomotriz.Mecanicos;
import HerenciaAutomotriz.Vendedores;

import java.util.Scanner;

public class EjecutaInversionista {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre,num_cuenta;
        double capital, plazo,porcentaje;
        String seleccion = "";
        int cont = 0;
        int op;
        boolean menu = true;
        String cadena = "\t\t\t\t\tREPORTE DE INVERSIONES\nNo. Cliente\t\t\tNombre\t\tNo. Cuenta\t\tInterés Ganado\n" +
                "------------------------------------------------------------------------\n";
        do {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Elija una opción: ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("1.CUENTA DE AHORROS");
            System.out.println("2.PAGARE");
            System.out.println("3.CUENTA MAESTRA");
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
                    System.out.print("Ingrese el capital que ha invertido: ");
                    capital=teclado.nextDouble();
                    System.out.print("Ingrese el porcentaje de interés: ");
                    porcentaje=teclado.nextDouble();
                    System.out.print("Ingrese el plazo de inversión en años: ");
                    plazo=teclado.nextDouble();

                    CuentaAhorro C_A = new CuentaAhorro(nombre,num_cuenta,capital,porcentaje,plazo);
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, nombre, num_cuenta
                            , C_A.calcularInteres());

                    break;
                case 2:
                    cont+=1;
                    System.out.print("Ingrese su nombre: ");
                    nombre=teclado.nextLine();
                    System.out.print("Ingrese su número de cuenta: ");
                    num_cuenta=teclado.nextLine();
                    System.out.print("Ingrese el capital que ha invertido: ");
                    capital=teclado.nextDouble();
                    System.out.print("Ingrese el porcentaje de interés: ");
                    porcentaje=teclado.nextDouble();
                    System.out.print("Ingrese el plazo de inversión en años: ");
                    plazo=teclado.nextDouble();

                    Pagare pa = new Pagare(nombre,num_cuenta,capital,porcentaje,plazo);
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, nombre, num_cuenta,
                            pa.calcularInteres());
                    break;
                case 3:
                    cont+=1;
                    System.out.print("Ingrese su nombre: ");
                    nombre=teclado.nextLine();
                    System.out.print("Ingrese su número de cuenta: ");
                    num_cuenta=teclado.nextLine();
                    System.out.print("Ingrese el capital que ha invertido: ");
                    capital=teclado.nextDouble();
                    System.out.print("Ingrese el porcentaje de interés: ");
                    porcentaje=teclado.nextDouble();
                    System.out.print("Ingrese el plazo de inversiónen años: ");
                    plazo=teclado.nextDouble();

                    CuentaMaestra C_M = new CuentaMaestra(nombre,num_cuenta,capital,porcentaje,plazo);
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, nombre, num_cuenta,
                            C_M.calcularInteres());
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
