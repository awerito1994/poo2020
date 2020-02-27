package Herencia;

import java.util.Date;
import java.util.Scanner;

public class EjecutaPersonal {
    public static void main(String[] args) {


        String nombre, identificacion, estado_civil,fecha_nac,carrera,area, dependencia;
        Scanner teclado=new Scanner(System.in);
        System.out.println("CREACION DE OBJETO ESTUDIANTE");
        System.out.println("Ingrese el nombre: ");
        nombre=teclado.nextLine();
        System.out.println("Ingrese la identificacion: ");
        identificacion=teclado.nextLine();
        System.out.println("Ingrese la carrera: ");
        carrera=teclado.nextLine();
        System.out.println("Ingrese estado civil: ");
        estado_civil=teclado.nextLine();
        System.out.println("Ingrese fecha de nacimiento: ");
        fecha_nac= teclado.nextLine();

      //Creacion del objeto
        Estudiante est = new Estudiante(carrera,nombre,identificacion,estado_civil,fecha_nac);


        System.out.println("====================================================");
        System.out.println("DATOS DEL OBJETO DEL ESTUDIANTE");
        System.out.println("Nombre: "+est.getNombre());
        System.out.println("Identifacion: "+est.getIdentificacion());
        System.out.println("Carrera: "+est.getCarrera());
        System.out.println("Estado civil: "+est.getEstado_civil());
        System.out.println("Fecha de nacimiento: "+est.getFecha_nac());

        System.out.println("=============================================================");

        System.out.println("CREACION DE OBJETO DEL DOCENTE");
        System.out.println("Ingrese el nombre: ");
        nombre=teclado.nextLine();
        System.out.println("Ingrese la identificacion: ");
        identificacion=teclado.nextLine();
        System.out.println("Ingrese estado civil: ");
        estado_civil=teclado.nextLine();
        System.out.println("Ingrese fecha de nacimiento: ");
        fecha_nac= teclado.nextLine();
        System.out.println("Ingrese el area del docente: ");
        area=teclado.nextLine();

        //Creacion del objeto
        Docente docente = new Docente(area,nombre,identificacion,estado_civil,fecha_nac);
        System.out.println("====================================================");
        System.out.println("DATOS DEL OBJETO DEL DOCENTE");
        System.out.println("Nombre: "+docente.getNombre());
        System.out.println("Identifacion: "+docente.getIdentificacion());
        System.out.println("Estado civil: "+docente.getEstado_civil());
        System.out.println("Fecha de nacimiento: "+docente.getFecha_nac());
        System.out.println("Area del docente: "+docente.getarea());

        System.out.println("=============================================================");

        System.out.println("CREACION DE OBJETO DEL PERSONAL ADMINISTRATIVO");
        System.out.println("Ingrese el nombre: ");
        nombre=teclado.nextLine();
        System.out.println("Ingrese la identificacion: ");
        identificacion=teclado.nextLine();
        System.out.println("Ingrese estado civil: ");
        estado_civil=teclado.nextLine();
        System.out.println("Ingrese fecha de nacimiento: ");
        fecha_nac= teclado.nextLine();
        System.out.println("Ingrese la dependencia del Personal Administrativo: ");
        dependencia=teclado.nextLine();
        //Creacion del objeto
        Administrativo adm = new Administrativo(dependencia,nombre,identificacion,estado_civil,fecha_nac);
        System.out.println("====================================================");
        System.out.println("DATOS DEL OBJETO DEL DOCENTE");
        System.out.println("Nombre: "+docente.getNombre());
        System.out.println("Identifacion: "+adm.getIdentificacion());
        System.out.println("Estado civil: "+adm.getEstado_civil());
        System.out.println("Fecha de nacimiento: "+adm.getFecha_nac());
        System.out.println("Dependencia Administrativa: "+adm.getDependencia());

    }
}
