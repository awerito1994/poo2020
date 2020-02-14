package taller_repeticion;
// Alexander Loja, Ricoardo Freire,Génesis Gonzáles
import java.util.Scanner;

public class EjecutaCajero {
    public static void main(String[] args) {
        //Declaración de varaibles
        Scanner entrada=new Scanner(System.in);
        double deposito;
        double retiro;
        boolean menu = true;
        double saldo;
        String seleccion= "";
        int opcion;
        System.out.print("Ingrese saldo inicial de su cuenta: ");
        saldo = entrada.nextDouble();
        Cajero cajero = new Cajero(saldo);
        do{
            System.out.println("-------------------------------------");
            System.out.println("Opcion 1: Realizar deposito:         ");
            System.out.println("Opcion 2: Realizar retiro:        ");
            System.out.println("Opcion 3: Realizar consulta de saldo:");
            System.out.println("Opcion 4: Salir                     ");
            System.out.println("--------------------------------------");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Cuanto desea depositar:");
                    deposito = entrada.nextDouble();
                    cajero.Deposito(deposito);
                    cajero.calcularDeposito();
                    cajero.obtenerSaldo();
                    break;
                case 2:
                    System.out.print("Cuanto desea retirar:");
                    retiro = entrada.nextDouble();
                    cajero.Retiro(retiro);
                    cajero.calcularRetiro();
                    cajero.obtenerSaldo();
                    break;
                case 3:
                    cajero.obtenerSaldo();
                case 4:
                    menu = false;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }

        }while(menu==true);
    }
    }

