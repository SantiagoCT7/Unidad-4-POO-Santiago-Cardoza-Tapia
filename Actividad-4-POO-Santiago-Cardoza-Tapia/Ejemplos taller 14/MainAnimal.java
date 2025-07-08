
public class MainAnimal {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        miAnimal.hacerSonido();
        miAnimal = new Gato();
        miAnimal.hacerSonido();
    }
}
