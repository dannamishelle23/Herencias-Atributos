package Animales;

//Definir la superclase
public class Animal {
    //Definir los atributos privados
    private String nombre;
    private int edad;

    //Metodos constructores
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodo personalizado
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

//Subclase Perro
class Perro extends Animal {
    //Esta subclase no tiene atributos adicionales
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("El perro ladra: ¡Guau, guau!");
    }
}

// Subclase Gato
class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("El gato maúlla: ¡Miau!");
    }
}