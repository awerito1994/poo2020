package taller_repeticion;
// Alexander Loja, Ricoardo Freire,Génesis Gonzáles
import java.util.Scanner;
public class EjecutaMultiplicacion {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double dividendo;
        double divisor;

        System.out.print("Ingrese número al factor uno: ");
        dividendo= entrada.nextDouble();
        System.out.print("Ingrese número al factor 2: ");
        divisor =entrada.nextDouble();
        Multiplicacion multiplicacion=new Multiplicacion(dividendo,divisor);
        System.out.println(+multiplicacion.getFactor1()+" x "+multiplicacion.getFactor2()+" es: "+multiplicacion.producto());
    }
    }


