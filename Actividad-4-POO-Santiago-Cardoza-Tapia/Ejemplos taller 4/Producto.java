public class Producto {

    private double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    public void actualizarPrecio(double nuevoPrecio) {
        // No hay validación aquí
        precio = nuevoPrecio;
    }
}