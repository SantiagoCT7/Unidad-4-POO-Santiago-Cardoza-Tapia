public class Coche1 extends Vehiculo1{
    private int numeroDePuertas;

    public Coche1(String marca, int velocidadMaxima, int numeroDePuertas){
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Numero de puertas: " + numeroDePuertas);
    }
}
