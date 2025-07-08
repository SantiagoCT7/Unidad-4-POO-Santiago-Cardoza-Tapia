public class PruebaProducto1{
    public static void main(String[] args) {
        Producto1 producto = new Producto1("Camisa", 40000, 0.03);
        EtiquetaProducto etiqueta = new EtiquetaProducto();
        PrecioProducto precio = new PrecioProducto();

        etiqueta.generarEtiqueta(producto);
        System.out.println("Precio Final: " + precio.calcularPrecioFinal(producto));
//Como estoy colocando comentarios en este trabajo es posible que no este el proyecto tal cual como en la entrega al momento de hacer el video
    }
}
