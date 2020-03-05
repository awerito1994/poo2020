package PolimorfismoVolumen;

import HerenciaVolumen.Cilindro;
import HerenciaVolumen.Cono;
import HerenciaVolumen.Cubo;
import HerenciaVolumen.Esfera;

import java.util.Scanner;

public class EjecutaVolumen3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double arista,volumen,altura,radio;
        String seleccion= "";
        int op;
        boolean menu=true;
        do{
            System.out.println("ELIGA LA FIGURA QUE DESEE");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("1.Cubo");
            System.out.println("2.Cilindro");
            System.out.println("3.Cono");
            System.out.println("4.Esfera");
            System.out.println("5.Salir");
            System.out.println("-------------------------------------------------------------------");
            op=teclado.nextInt();
            teclado.nextLine();

            switch (op){

                case 1:


                    System.out.print("Ingrese el valor de la arista de la figura Triángulo: ");
                    arista=teclado.nextDouble();


                    //Método Contructor del Cubo
                    String nombre = "Cubo";
                    Cubo3 cu3 = new Cubo3(arista,nombre);
                    cu3.calcularVolumen();
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Nombre de la figura es: "+cu3.getNombre());
                    System.out.println("El volúmen de la figura es: "+cu3.getVolumen());
                    System.out.println("-------------------------------------------------------------------");
                    break;

                case 2:
                    String Nombre1= "Cilindro";
                    System.out.print("Ingrese el radio de la figura Cilindro: ");
                    radio=teclado.nextDouble();
                    System.out.print("Ingrese la altura de la figura Cilindro: ");
                    altura=teclado.nextDouble();


                    //Método Contructor del Cilindro
                    Cilindro3 cil3 = new Cilindro3(altura,radio,Nombre1);
                    cil3.calcularVolumen();
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Nombre de la figura: "+cil3.getNombre());
                    System.out.println("El área de la figura es: "+cil3.getVolumen());
                    System.out.println("-------------------------------------------------------------------");

                    break;

                case 3:
                    String Nombre2= "Cono";
                    System.out.print("Ingrese el radio de la figura Cono: ");
                    radio=teclado.nextDouble();
                    System.out.print("Ingrese la altura de la figura Cono: ");
                    altura=teclado.nextDouble();


                    //Método Contructor del Circulo
                    Cono3 co3 = new Cono3(radio,altura,Nombre2);
                    co3.calcularVolumen();
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Nombre de la figura: "+co3.getNombre());
                    System.out.println("El área de la figura es: "+co3.getVolumen());
                    System.out.println("-------------------------------------------------------------------");
                    break;

                case 4:
                    String Nombre3= "Esfera";
                    System.out.print("Ingrese el radio de la figura Esfera: ");
                    radio=teclado.nextDouble();



                    //Método Contructor del Cuadrado
                    Esfera3 esf3 = new Esfera3(radio,Nombre3);
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Nombre de la figura: "+esf3.getNombre());
                    System.out.println("El área de la figura es: "+esf3.getVolumen());
                    System.out.println("-------------------------------------------------------------------");

                    break;
                case 5:
                    menu = true;
                    System.out.println("No ha elegido ninguna figura.");
                    break;

                default:
                    System.out.println("Por favor ingrese la opción correcta ");
            }
            if (op == 5){
                menu = false;
            }
        } while (menu==true);

    }
    }