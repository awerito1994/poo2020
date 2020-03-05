package PolimorfismoInversionistas;

import HerenciaInversionistas.CuentaAhorro;
import HerenciaInversionistas.CuentaMaestra;
import HerenciaInversionistas.Pagare;

import java.util.Scanner;

public class EjecutaInversionista_Poli {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre,num_cuenta;
        double capital,porcentaje;
        String seleccion = "";
        int cont = 0;
        int plazo;
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
                    plazo=teclado.nextInt();

                    CuentaAhorro_poli cA = new CuentaAhorro_poli(nombre,num_cuenta,capital,plazo,porcentaje);
                    cA.calcularInteres();
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, nombre, num_cuenta
                            , cA.getInteres());

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
                    plazo=teclado.nextInt();

                    Pagare_poli pP = new Pagare_poli(nombre,num_cuenta,capital,plazo,porcentaje);
                    pP.calcularInteres();
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, nombre, num_cuenta
                            , pP.getInteres());
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
                    System.out.print("Ingrese el plazo de inversión en años: ");
                    plazo=teclado.nextInt();

                    CuentaMaestra_poli cM = new CuentaMaestra_poli(nombre,num_cuenta,capital,plazo,porcentaje);
                    cM.calcularInteres();
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, nombre, num_cuenta
                            , cM.getInteres());
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
