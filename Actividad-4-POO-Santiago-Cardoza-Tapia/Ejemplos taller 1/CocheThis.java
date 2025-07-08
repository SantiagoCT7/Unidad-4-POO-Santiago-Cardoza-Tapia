
public class Coche {
    String marca;
    String modelo;
    public Coche(String marca) {
        this.marca = marca;
    }
    public Coche(String marca, String modelo) {
        this(marca);
        this.modelo = modelo;
    }
}
