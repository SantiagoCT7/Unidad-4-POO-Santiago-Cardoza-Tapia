public class EtiquetaProducto{
    public void generarEtiqueta(Producto1 producto){
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio Base: " + producto.getPrecioBase());
        System.out.println("Impuesto: " + producto.getImpuesto());
    }
}
