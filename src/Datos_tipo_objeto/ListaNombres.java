package Datos_tipo_objeto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNombres {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<String>();
        Scanner teclado=new Scanner(System.in);
        int op;
        boolean menu=true;
        String seleccion= "";
        do {
            System.out.println("MENU");
            System.out.println("1.Agregar nuevo nombre: ");
            System.out.println("2.Presentar lista de nombres: ");
            System.out.println("3.Salir ");
            op=teclado.nextInt();
            teclado.nextLine();

            switch (op){
                case 1:
                    System.out.println("Ingrese un nombre: ");
                    nombres.add(teclado.nextLine());
                break;
                case 2:
                    System.out.println("NOMBRES");
                   for ( int cont = 0;cont<nombres.size();cont++){
                       System.out.println((cont+1)+"\t"+nombres.get(cont)) ;


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
