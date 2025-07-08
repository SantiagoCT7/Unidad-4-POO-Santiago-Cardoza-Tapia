
public class MainEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Gerente();
        Empleado empleado2 = new Ingeniero();
        empleado1.trabajar();
        empleado2.trabajar();
    }
}
