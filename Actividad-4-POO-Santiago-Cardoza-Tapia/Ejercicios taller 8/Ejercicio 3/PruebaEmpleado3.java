public class PruebaEmpleado3{
    public static void main(String[] args){
        Empleado3 e = new Empleado3("Santiago", 1.79e308);
        e.mostrarDetalles();

        System.out.println();

        Gerente g = new Gerente("Maria", 2600000, "Ejecucion Comercial");
        g.mostrarDetalles();
    }
}
