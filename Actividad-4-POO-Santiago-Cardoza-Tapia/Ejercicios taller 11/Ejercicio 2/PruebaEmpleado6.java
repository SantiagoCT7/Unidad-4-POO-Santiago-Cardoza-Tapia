public class PruebaEmpleado6{
    public static void main(String[] args){
        Empleado6 g = new Gerente1("Santiago", 1500000);
        Empleado6 v = new Vendedor("Maria", 2300000, 0.99);

        g.mostrarDetalles();
        v.mostrarDetalles();
    }
}
