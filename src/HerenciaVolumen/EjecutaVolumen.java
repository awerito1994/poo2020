package HerenciaVolumen;

import java.util.Scanner;

public class EjecutaVolumen {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        double arista,volumen,altura,radio;
        //String nombre;
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

                    String nombre= "Cubo";
                    System.out.print("Ingrese el valor de la arista de la figura Triángulo: ");
                    arista=teclado.nextDouble();


                    //Método Contructor del Cubo
                    Cubo cu = new Cubo(arista,nombre);
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Nombre de la figura es: "+cu.getNombre());
                    System.out.println("El volúmen de la figura es: "+cu.calcularVolumenCubo());
                    System.out.println("-------------------------------------------------------------------");
                    break;

                case 2:
                    String Nombre1= "Cilindro";
                    System.out.print("Ingrese el radio de la figura Cilindro: ");
                    radio=teclado.nextDouble();
                    System.out.print("Ingrese la altura de la figura Cilindro: ");
                    altura=teclado.nextDouble();


                    //Método Contructor del Cilindro
                    Cilindro cil = new Cilindro(altura,radio,Nombre1);
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Nombre de la figura: "+cil.getNombre());
                    System.out.println("El área de la figura es: "+cil.CalcularVolumenCilindro());
                    System.out.println("-------------------------------------------------------------------");

                    break;

                case 3:
                    String Nombre2= "Cono";
                    System.out.print("Ingrese el radio de la figura Cono: ");
                    radio=teclado.nextDouble();
                    System.out.print("Ingrese la altura de la figura Cono: ");
                    altura=teclado.nextDouble();


                    //Método Contructor del Circulo
                    Cono co = new Cono(radio,altura,Nombre2);
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Nombre de la figura: "+co.getNombre());
                    System.out.println("El área de la figura es: "+co.CalcularVolumenCono());
                    System.out.println("-------------------------------------------------------------------");
                    break;

                case 4:
                    String Nombre3= "Esfera";
                    System.out.print("Ingrese el radio de la figura Esfera: ");
                    radio=teclado.nextDouble();



                    //Método Contructor del Cuadrado
                    Esfera esf = new Esfera(radio,Nombre3);
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Nombre de la figura: "+esf.getNombre());
                    System.out.println("El área de la figura es: "+esf.CalcularVolumenEsfera());
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

