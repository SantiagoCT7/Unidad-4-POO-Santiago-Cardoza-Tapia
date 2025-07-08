public class Coche {

    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
        }
    }
}

class TestCoche {
    public static void main(String[] args) {
        Coche c = new Coche("Toyota", "Yaris", 180);
        // System.out.println(c.velocidadMaxima); // Error: acceso a propiedad privada
    }
}