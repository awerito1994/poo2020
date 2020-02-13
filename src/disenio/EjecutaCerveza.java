package disenio;

import java.util.Scanner;

public class EjecutaCerveza {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        //Creación de objetos con inicialización de variables
        System.out.println("Indique el nombre de la cerveza: ");
        String nombre = teclado.nextLine();
        System.out.println("Indique el tipo de cerveza: ");
        String tipo = teclado.nextLine();
        System.out.println("Ingrese el costo: ");
        double precio = teclado.nextDouble();
        System.out.println("Ingrese las unidades vendidas: ");
        int unidades_vendidas = teclado.nextInt();
        Cerveza cerveza= new Cerveza(precio,unidades_vendidas,nombre,tipo);
        System.out.println("El precio es: "+cerveza.calcular_ventas());




    }
}
