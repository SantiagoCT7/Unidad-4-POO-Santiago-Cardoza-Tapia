public class Vehiculo1{
    protected String marca;
    protected int velocidadMaxima;

    public Vehiculo1(String marca, int velocidadMaxima){
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion(){
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad maxima: " + velocidadMaxima);
    }
}
