package taller_repeticion;
// Alexander Loja, Ricoardo Freire,Génesis Gonzáles
public class Multiplicacion {
    private double factor1;
    private double factor2;
    private double producto;

    /**
     * Método constructor para la multiplicación
     * @param factor1
     * @param factor2
     */
    public Multiplicacion (double factor1,double factor2){
        this.factor1=factor1;
        this.factor2=factor2;
    }

    /**
     * Método para el factor uno
     * @return
     */
    public double getFactor1() {
        return factor1;
    }

    /**
     * Método para el factor dos
     * @return
     */
    public double getFactor2() {
        return factor2;
    }

    /**
     * Método para calcular el producto de los 2 factores
     * @return
     */
    public double producto(){
        for(int i=0;i<factor2;i++){
            producto=producto+factor1;
        }
        return producto;
    }
}
