package HerenciaFigura;

import java.util.Scanner;

public class EjecutaFiguras {
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

                    String Nombre= "Triángulo";
                    System.out.print("Ingrese la base de la figura Triángulo ");
                    base=teclado.nextDouble();
                    System.out.print("Ingrese la altura de la figura Triángulo");
                    altura=teclado.nextDouble();


                    //Método Contructor del Triángulo
                    Triangulo tri = new Triangulo(base,altura,Nombre);
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Nombre de la figura: "+tri.getNombre());
                    System.out.println("El área de la figura es: "+tri.calcularareatriangulo());
                    System.out.println("-------------------------------------------------------------------");
                    break;

                case 2:
                    String Nombre1= "Rectángulo";
                    System.out.print("Ingrese la base de la figura Rectángulo: ");
                    base=teclado.nextDouble();
                    System.out.print("Ingrese la altura de la figura Rectángulo: ");
                    altura=teclado.nextDouble();


                    //Método Contructor del Rectángulo
                    Rectangulo rect = new Rectangulo(base,altura,Nombre1);
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Nombre de la figura: "+rect.getNombre());
                    System.out.println("El área de la figura es: "+rect.calcularareaRectangulo());
                    System.out.println("-------------------------------------------------------------------");

                    break;

                case 3:
                    String Nombre2= "Circulo";
                    System.out.print("Ingrese el radio de la figura Circulo: ");
                    radio=teclado.nextDouble();


                    //Método Contructor del Circulo
                    Circulo cir = new Circulo(radio,Nombre2);
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Nombre de la figura: "+cir.getNombre());
                    System.out.println("El área de la figura es: "+cir.calcularareaCirculo());
                    System.out.println("-------------------------------------------------------------------");
                    break;

                case 4:
                    String Nombre3= "Cuadrado";
                    System.out.print("Ingrese el lado de la figura Cuadrado: ");
                    lado=teclado.nextDouble();



                    //Método Contructor del Cuadrado
                    Cuadrado cua = new Cuadrado(lado,Nombre3);
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Nombre de la figura: "+cua.getNombre());
                    System.out.println("El área de la figura es: "+cua.calcularareaCuadrado());
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
