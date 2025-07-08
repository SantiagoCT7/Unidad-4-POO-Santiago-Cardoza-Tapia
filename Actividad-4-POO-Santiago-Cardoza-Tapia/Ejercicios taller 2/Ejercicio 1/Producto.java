public class Producto{
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
    }

    public static void main(String[] args){
        Producto p = new Producto("Portatil Lenovo", 1399000 );
        p.mostrarProducto();
    }
}
