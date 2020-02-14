package taller_repeticion;
// Alexander Loja, Ricoardo Freire,Génesis Gonzáles
public class Factorial {
    //Definicion de atributos
    private  int num=0;
    private int factorial=1;

    /**
     * Método constructor para el número factorial
     * @param num
     */
    public Factorial(int num){
        this.num=num;
    }

    /**
     * Método sirve para calcular el factorial de un numero
     * @param n
     * @return
     */
    public int calcular_factorial(int n){
        for(int i=1;i<=n;i++) {
            factorial=factorial*i;
        }
        return factorial;
    }

    public int getFactorial() {
        return factorial;
    }
}
