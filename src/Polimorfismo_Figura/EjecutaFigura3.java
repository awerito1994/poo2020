package Polimorfismo_Figura;

import HerenciaFigura.Circulo;
import HerenciaFigura.Cuadrado;
import HerenciaFigura.Rectangulo;
import HerenciaFigura.Triangulo;

import java.util.Scanner;

public class EjecutaFigura3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double lado,base,altura,radio, area;
        String nombre;
        String seleccion= "";
        int op;
        boolean menu=true;
        do{
            System.out.println("ELIGA LA FIGURA QUE DESEE");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("1.Triángulo");
            System.out.println("2.Rectángulo");
            System.out.println("3.Circulo");
            System.out.println("4.Cuadrado");
            System.out.println("5.Salir");
            System.out.println("-------------------------------------------------------------------");
            op=teclado.nextInt();
            teclado.nextLine();

            switch (op){

                case 1:

                    System.out.print("Ingrese la base de la figura Triángulo: ");
                    base=teclado.nextDouble();
                    System.out.print("Ingrese la altura de la figura Triángulo: ");
                    altura=teclado.nextDouble();


                    //Método Contructor del Triángulo
                    Triangulo3 tri3 = new Triangulo3(base,altura);
                    tri3.calcularArea();
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("El área de la figura es: "+tri3.getArea());
                    System.out.println("-------------------------------------------------------------------");
                    break;

                case 2:
                    System.out.print("Ingrese la base de la figura Rectángulo: ");
                    base=teclado.nextDouble();
                    System.out.print("Ingrese la altura de la figura Rectángulo: ");
                    altura=teclado.nextDouble();


                    //Método Contructor del Rectángulo
                    Rectangulo3 rect3 = new Rectangulo3(base,altura);
                    rect3.calcularArea();
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("El área de la figura es: "+rect3.getArea());
                    System.out.println("-------------------------------------------------------------------");

                    break;

                case 3:

                    System.out.print("Ingrese el radio de la figura Circulo: ");
                    radio=teclado.nextDouble();


                    //Método Contructor del Circulo
                    Circulo3 cir3 = new Circulo3(radio);
                    cir3.calcularArea();
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("El área de la figura es: "+cir3.getArea());
                    System.out.println("-------------------------------------------------------------------");
                    break;

                case 4:
                    System.out.print("Ingrese el lado de la figura Cuadrado: ");
                    lado=teclado.nextDouble();



                    //Método Contructor del Cuadrado
                    Cuadrado3 cua3 = new Cuadrado3(lado);
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("El área de la figura es: "+cua3.getArea());
                    System.out.println("-------------------------------------------------------------------");

                    break;
                case 5:
                    menu = true;
                    System.out.println("No ha elegido ninguna figura. Gracias por su visita.");
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
