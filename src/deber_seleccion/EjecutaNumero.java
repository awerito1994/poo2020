package deber_seleccion;
import java.util.Scanner;
public class EjecutaNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declaracion de variables
        double numA;
        double numB;
        double numC;
        double numD;
        double numMayor;

        // Entrada de datos
        System.out.print("Ingrese el primero numero: ");
        numA = entrada.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        numB = entrada.nextDouble();
        System.out.print("Ingrese el tercer numero: ");
        numC = entrada.nextDouble();
        System.out.print("Ingrese el cuarto numero: ");
        numD = entrada.nextDouble();


        // Creación de nuestro objeto
        Numero numero = new Numero(numA, numB, numC, numD);

        System.out.println(numero.mostrar());
    }
}
