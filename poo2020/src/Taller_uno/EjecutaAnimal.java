package Taller_uno;

public class EjecutaAnimal {
    public static void main(String[] args) {
        //Creación de características del animal
        Animal animal = new Animal();
        animal.actualizar_nombre("Tigre");
        animal.actualizar_sexo("Masculino");
        animal.actualizar_peso(50);
        animal.actualizar_especie("tigris");
        animal.actualizar_region("Rusia");
        animal.getAnimal();
        String mostrar_animal = animal.getAnimal();
        System.out.println(mostrar_animal);
    }
}
