public class Bicicleta extends Vehiculo {
    @Override
    public void mostrarTipo() {
        super.mostrarTipo(); // Uso innecesario
        System.out.println("Este es un tipo de bicicleta.");
    }
}