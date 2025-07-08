public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static void mostrarContador() {
        System.out.println("Coches creados: " + contadorCoches);
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    public static void main(String[] args) {
        Coche c1 = new Coche("Toyota", "Corolla");
        Coche c2 = new Coche("Honda", "Civic");
        Coche c3 = new Coche("Dominar", "400");

        c1.mostrarDetalles();
        c2.mostrarDetalles();
        c3.mostrarDetalles();

        Coche.mostrarContador();
    }
}
