package taller_repeticion;
// Alexander Loja, Ricoardo Freire,Génesis Gonzáles

import java.util.Scanner;

public class EjecutaFactorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num =0;
        int n;
        System.out.print("Cuantos números desea ingresar: ");
        n=entrada.nextInt();
        for(int i =1;i<=n;i++){
            System.out.print("Ingrese un numero: ");
            num = entrada.nextInt();
            Factorial factorial = new Factorial(num);
            factorial.calcular_factorial(num);
            System.out.println("El siguiente número factorial del número dado es : "+factorial.getFactorial());
        }
    }
}