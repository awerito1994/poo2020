package Polimorfismo_poo;

import java.util.Scanner;

public class EjecutaEmpleado12 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double horas_tra;
        double cuota_hora;
        double sueldo_mensual;


        //OBtener el sueldo quincenal de un empleado por horas

        System.out.println("Cálculo sueldo quincenal empleado por hora");
        System.out.println("Ingrese horas trabajadas: ");
        horas_tra=teclado.nextDouble();
        System.out.println("Ingrese la cuota por hora: ");
        cuota_hora=teclado.nextDouble();
        EmpleadoPorHoras2 empHoras = new EmpleadoPorHoras2(horas_tra,cuota_hora);
        empHoras.calcularSueldoQna();
        System.out.println("El sueldo quincenal es: "+empHoras.getSueldo());

        System.out.println("Cálculo sueldo quincenal de empleado asalariado");
        System.out.println("Ingrese el sueldo mensual: ");
        sueldo_mensual=teclado.nextDouble();
        EmpleadoAsalariado2 empAsa = new EmpleadoAsalariado2(sueldo_mensual);
        empAsa.calcularSueldoQna();
        System.out.println("El sueldo mensual del empleado asalariado es: "+empAsa.getSueldo());




    }
}
