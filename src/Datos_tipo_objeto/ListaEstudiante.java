package Datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEstudiante {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();

        boolean menu=true;
        String seleccion= "";
        String nombre,cedula,carrera,correo;
        int edad;
        do {
            System.out.println("ESTUDIANTE");
            System.out.println("1.Almacenar estudiante: ");
            System.out.println("2.Presentar lista de estudiantes: ");
            System.out.println("3.Salir ");
            int op = teclado.nextInt();
            teclado.nextLine();

            switch (op){
                case 1:

                    System.out.println("Ingrese el nombre del estudiante: ");
                    nombre=teclado.nextLine();
                    System.out.println("Ingrese la cedula del estudiante: ");
                    cedula=teclado.nextLine();
                    System.out.println("Ingrese la edad del estudiante: ");
                    edad=teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la carrera del estudiante: ");
                    carrera=teclado.nextLine();
                    System.out.println("Ingrese el correo del estudiante ");
                    correo=teclado.nextLine();
                    Estudiante estudiante = new Estudiante(nombre,cedula,edad,carrera,correo);
                    //Agregamos objeto vehiculo a la lista
                    estudiantes.add(estudiante);
                    break;
                case 2:
                    //Recorremos lista con forech
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Nombre\tCedula\tEdad\tCarrera\t\tCorreo");
                    for ( Estudiante e : estudiantes){
                        System.out.println(e.getNombre()+"\t"+e.getCedula()+"\t"+e.getEdad()+"\t"+e.getCarrera()+"\t"+e.getCorreo());

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
