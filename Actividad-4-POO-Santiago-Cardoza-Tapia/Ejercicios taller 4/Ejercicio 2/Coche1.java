public class Coche1{
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche1(String marca, String modelo, int velocidadMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(int incremento){
        if (incremento > 0){
            velocidadMaxima += incremento;
        }
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
}

