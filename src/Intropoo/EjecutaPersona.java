package Intropoo;

public class EjecutaPersona {
    public static void main(String[] args) {
        //Creacion de objetos, con inicialización de variables
        Persona persona = new Persona("Masculino","católica",25,"Alex");
        System.out.println("edad: "+persona.getEdad());
        System.out.println("género: "+persona.getGenero("Masculino"));
        System.out.println("religión: "+persona.getReligion());
        System.out.println("Nombre: "+persona.getNombre());

        //Creacion de segundo objeto con estructor 2
        Persona persona2= new Persona("Masculino","catolica",25);
        Persona persona3= new Persona("Masculino","catolica",38);
        System.out.println("Edad persona 2: "+persona2.getEdad());
        System.out.println("Edad persona 3: "+persona3.getEdad());
        System.out.println("Nombre persona 2: "+persona2.getNombre());


    }
}
