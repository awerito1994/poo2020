package taller_repeticion;
// Alexander Loja, Ricoardo Freire,Génesis Gonzáles

import java.util.Scanner;

public class EjecutaDivision {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double dividendo;
        double divisor;
        System.out.println("Ingrese el dividendo");
        dividendo = entrada.nextDouble();
        System.out.println("Ingrese el divisor");
        divisor = entrada.nextDouble();
        Division division = new Division(dividendo, divisor);
        division.calcularSolucion();
        division.obtenerCociente();
    }

}
