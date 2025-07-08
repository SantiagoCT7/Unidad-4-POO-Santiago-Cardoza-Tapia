public class Coche {

    private String marca;
    private String modelo;
    static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static void mostrarCantidadCoches() {
        System.out.println("Total de coches creados: " + contadorCoches);
    }
}