package deber_seleccion;

public class Numero {

    private double numA;
    private double numB;
    private double numC;
    private double numD;
    private double numMayor;
    /**
     * M�todo constructor para los n�meros
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
     * �M�todo para calcular cual de los n�meros es mayor
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
    * M�todo para mostrar en la impresi�n el numero mayor
    * @return 
    */
   public String mostrar(){
          String mostrar_numero=String.format("El número mayor es: %.2f",calcularNumMayor());
          return mostrar_numero;
    }
}
