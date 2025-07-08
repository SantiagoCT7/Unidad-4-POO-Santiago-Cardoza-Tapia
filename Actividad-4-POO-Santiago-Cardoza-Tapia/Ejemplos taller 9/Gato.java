public class Gato extends Animal {
    private String color;

    public Gato(String especie, String color) {
        super(especie);
        this.color = color;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie();
        System.out.println("Color: " + color);
    }
}