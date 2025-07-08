public class PrecioProducto{
    public double calcularPrecioFinal(Producto1 producto){
        return producto.getPrecioBase() + (producto.getPrecioBase() * producto.getImpuesto());
//al momento de hacer los ejercicios que tenia que hacer que dieran errores a proposito me cuestionaba si arreglarlos y subirlos o añadir 
//un comentario de como arreglarlo o del problema, al final pense que era simplemente mejor dejarlos como estaban.
    }
}
