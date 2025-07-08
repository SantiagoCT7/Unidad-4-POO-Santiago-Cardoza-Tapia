public class Empleado {

    private String nombre;

    public static void mostrarNombre() {
        // Error: acceso a atributo no estático desde método estático
        System.out.println("Nombre: " + nombre);
    }
}