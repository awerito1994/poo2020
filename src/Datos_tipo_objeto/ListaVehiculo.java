package Datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehiculo {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        boolean menu=true;
        String seleccion= "";
        String placa,modelo,marca,color, cilindraje;
        int anio;
        do {
            System.out.println("VEHICULOS");
            System.out.println("1.Almacenar nuevo: ");
            System.out.println("2.Presentar lista de vehiculos: ");
            System.out.println("3.Salir ");
            int op = teclado.nextInt();
            teclado.nextLine();

            switch (op){
                case 1:

                    System.out.println("Ingrese placa del vehiculo: ");
                    placa=teclado.nextLine();
                    System.out.println("Ingrese modelo del vehiculo: ");
                    modelo=teclado.nextLine();
                    System.out.println("Ingrese marca del vehiculo: ");
                    marca=teclado.nextLine();
                    System.out.println("Ingrese año del vehiculo: ");
                    anio=teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese color del vehiculo: ");
                    color=teclado.nextLine();
                    System.out.println("Ingrese cilindraje del vehiculo: ");
                    cilindraje=teclado.nextLine();
                    Vehiculo vehiculo = new Vehiculo(placa,modelo,marca,anio,color,cilindraje);
                    //Agregamos objeto vehiculo a la lista
                    vehiculos.add(vehiculo);
                    break;
                case 2:
                    //Recorremos lista con forech
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Placa\tMarca\tCilindraje");
                    for ( Vehiculo v : vehiculos){
                        System.out.println(v.getPlaca()+"\t"+v.getMarca()+"\t"+v.getCilindraje());

                    }
                    break;
                case 3:
                    menu = true;
                    System.out.println("No ha elegido a ninga opcion. Gracias por su visita.");
                    break;
                default:
                    System.out.println("Por favor ingrese la opción correcta");

            }
            if (op== 3) {
                menu = false;
            }

        }while (menu==true);

    }
}
