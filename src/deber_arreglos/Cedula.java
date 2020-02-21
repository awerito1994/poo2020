package deber_arreglos;

public class Cedula {
    // declaracion de variables
    private String cedula;
    private int respuesta;
    private int [] coeficiente = {2,1,2,1,2,1,2,1,2};
    private int suma = 0;
    private int prdoucto = 0;


    /**
     * Método constructor de la cédula
     * @param cedula
     */
    public Cedula(String cedula){
        this.cedula = cedula;
    }
    /**
     * Método parse para convertir un String a un arreglo de enteros
     * @return nums[]
     */
    public int[] cambio(){
        int[] arreglo = new int[cedula.length()];
        for(int i=0; i<cedula.length(); i++){
            arreglo[i] = Character.getNumericValue(cedula.charAt(i));
        }
        return arreglo;
    }

    /**
     * Metodo para obtener la suma de la cédula
     * @return suma
     */
    public int obtenerSuma(){
        for (int i = 0; i < 9; i++) {
            prdoucto = cambio()[i] * coeficiente[i];
            if (prdoucto >= 10){
                prdoucto = prdoucto - 9;
            }
            suma = suma + prdoucto;
        }
        return suma;
    }

    /**
     * Método para verificar un número de cédula
     * @return cadena
     */
    public String  verificarCedula(){
        String mostrar = "";
        respuesta = 0;
        respuesta = 10 - (obtenerSuma()%10);
        if (respuesta == 10){
            respuesta = 0;
        }
        if (respuesta == cambio()[9]){
            mostrar = "El numero de cedula es correcto";
        }else{
            mostrar = "El número de cédula es incorrecto, por favor ingrese un número de cédula correcto";
        }
        return mostrar;
    }
}
