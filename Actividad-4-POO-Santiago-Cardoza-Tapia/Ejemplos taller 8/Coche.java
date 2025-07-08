public class Coche extends Vehiculo {
    public void mostrarMarca() {
        System.out.println(marca); // Error de compilación: acceso privado
    }
}