package arreglospoo;

public class Desviacion {
    private int[] numero = new int[10];
    private double media;
    private double[] desviacion = new double[10];

    /*
    Obtencion de numero desde el construtor
     */
    public Desviacion(int[] num) {
        this.numero = num;
    }

    /*
    Metodo para calcular la media
     */
    public void calcularMedia() {
        for (int i = 0; i < numero.length; i++) {
            media = media + numero[i];
        }
        media = media / numero.length;
    }

    /*
    Metodo para calcular la desviacion
     */
    public void calcularDesviacion() {
        for (int i = 0; i < numero.length; i++) {
            desviacion[i] = numero[i] - media;
        }
    }

    /*
    Metodo para la presentacion de Numero y Desviacion
     */
    public void presentar() {
        System.out.print("Numero \tDesviacion");
        for (int i = 0; i < numero.length; i++) {
            System.out.print("\n\t" + numero[i] + " \t " + desviacion[i]);
        }

    }
}
