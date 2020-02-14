package deber_seleccion;

public class Numero {

    private double numA;
    private double numB;
    private double numC;
    private double numD;
    private double numMayor;
    /**
     * Método constructor para los números
     * @param numA
     * @param numB
     * @param numC
     * @param numD 
     */
    public Numero(double numA,double numB,double numC,double numD){
        this.numA = numA;
        this.numB = numB;
        this.numC = numC;
        this.numD = numD;
    }
    /**
     * ´Método para calcular cual de los números es mayor
     * @return 
     */
   public double calcularNumMayor(){
       if(numA > numB && numA >numC && numA >numD){
           numMayor = numA;
       } else if(numB >numC && numB >numD){
           numMayor = numB;
       } else if(numC >numD){
           numMayor = numC;
       } else{
           numMayor = numD;
       }
       return numMayor;
   }
   /**
    * Método para mostrar en la impresión el numero mayor
    * @return 
    */
   public String mostrar(){
          String mostrar_numero=String.format("El nÃºmero mayor es: %.2f",calcularNumMayor());
          return mostrar_numero;
    }
}
