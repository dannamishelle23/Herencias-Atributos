package Animales;

//Definir la clase principal para crear las instancias
public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Bruno", 4);
        Gato gato1 = new Gato("Clarita", 3);

        //Obtener los datos usando los getter
        System.out.println("Nombre del perro: " + perro1.getNombre());
        System.out.println("Edad del perro: " + perro1.getEdad());
        perro1.hacerSonido();

        System.out.println("\nNombre del gato: " + gato1.getNombre());
        System.out.println("Edad del gato: " + gato1.getEdad());
        gato1.hacerSonido();

        //En caso de aplicar un setter
        System.out.println("Datos modificados: ");
        perro1.setNombre("Dante");
        perro1.setEdad(5);

        gato1.setNombre("Bertha");
        gato1.setEdad(4);

        //Mostrar valores actualizados
        System.out.println("Nuevo nombre: " + perro1.getNombre());
        System.out.println("Edad: " + perro1.getEdad());
        perro1.hacerSonido();

        System.out.println("Nuevo nombre: " + gato1.getNombre());
        System.out.println("Edad: " + gato1.getEdad());
        gato1.hacerSonido();
    }
}
