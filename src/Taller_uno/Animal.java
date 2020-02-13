package Taller_uno;

public class Animal {
    //Definicion de atributos
    private String nombre;
    private String sexo;
    private double peso;
    private String especie;
    private String region;

    /**
     * Método para obtener el nombre del animal
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener el sexo del animal
     * @return
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Método para obtener el peso del animal
     * @return
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Métood para obtener la especie del animal
     * @return
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Método para obtener de que región es el animal
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * Método para obtener las caracteristicas del animal
     * @return
     */
    public String getAnimal(){
        System.out.println("Caracteristicas de un animal específico");
        String animal = nombre +","+""+sexo+","+peso+","+especie+","+region+".";
        return animal;

    }

    /**
     * Método para actualizar el nombre del animal a
     * @param nombre
     */
    public void actualizar_nombre(String nombre){
        this.nombre = nombre;

    }

    /**
     * Método para actualizar el sexo del animal
     * @param sexo
     */
    public void actualizar_sexo(String sexo){
        this.sexo=sexo;
    }

    /**
     * Método para actualizar el peso del animal
     * @param peso
     */
    public void actualizar_peso(double peso){
        this.peso=peso;
    }

    /**
     * Método para actualizar la especie del animal
     * @param especie
     */
    public void actualizar_especie(String especie){
        this.especie=especie;
    }

    /**
     * Método para actualizar la región del animal
     * @param region
     */
    public void actualizar_region(String region){
        this.region=region;
    }
}
