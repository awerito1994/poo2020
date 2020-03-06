package Datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;

public class EmploLista {
    public static void main(String[] args) {
        //Creación de una lista en java
        //para almacenar valores de tipo String
        List<String> universidades = new ArrayList<String>();
        universidades.add("utpl");
        System.out.println("Tamaño de la lista: " + universidades.size());
        universidades.add("espol");
        System.out.println("Tamaño de la lista: " + universidades.size());
        universidades.add("unl");
        System.out.println("Tamaño de la lista: " + universidades.size());
        //Elimininacion del elemento en la posicion 1
        universidades.remove(1);
        System.out.println("Tamaño de la lista luego de eliminar elementos:  " + universidades.size());
        //Recorremos lista para presentar valores
        System.out.println("VALORES DE LA LISTA");
        //Reemplazamos el valor de una posicion indicada en nuestar lista
        universidades.add(1,"unl");
        /*for (int cont = 0; cont < universidades.size(); cont++) {
            System.out.println(universidades.get(cont));
        }*/
        for (String univ: universidades){
            System.out.println(univ);
        }
    }
}