public class Perro extends Animal {
    private String raza;

    public Perro(String especie, String raza) {
        super(especie);
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println("El perro ladra.");
    }

    @Override
    public void emitirSonido() {
        System.out.println("El perro ladra.");
    }
}