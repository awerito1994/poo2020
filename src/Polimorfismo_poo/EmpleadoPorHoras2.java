package Polimorfismo_poo;

public class EmpleadoPorHoras2 extends Empleado12 {

    //Atributos propios de la clase
    private double horas_tra;
    private double cuota_hora;


    //También se esxtienden los atributos de la clase
 public EmpleadoPorHoras2(double horas_tra, double cuota_hora){
     this.horas_tra=horas_tra;
     this.cuota_hora=cuota_hora;
 }

@Override
public void calcularSueldoQna() {
     sueldo= horas_tra * cuota_hora;

     }
    //También se extienden los métodos de la clase

}
