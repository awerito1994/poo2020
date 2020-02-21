package deber_arreglos;

public class Binario {
    //Declaración de variable
    private int decimal = 0;
    private  int entero = 0;
    private String num= "";
    /**
     * Metodo constructor para hallar el número binario
     * @param numero
     */
    public Binario(String numero){
        num = numero;
    }

    /**
     * Método parse para convertir un String a números enteros
     * @return nums[]
     */
    public int[] cambio(){
        int[] array = new int[num.length()];
        for(int i=0; i<num.length(); i++){
            array[i] = Character.getNumericValue(num.charAt(i));
        }
        return array;
    }

    /**
     * Método para obtener número decimal a partir de un binario
     * @return
     */
    public int calcularDecimal(){
        for (int i = cambio().length-1; i >=0 ; i--) {
            double mult = Math.pow(2, entero);
            decimal += cambio()[i] * mult;
            entero++;
        }
        return decimal;
    }
}
