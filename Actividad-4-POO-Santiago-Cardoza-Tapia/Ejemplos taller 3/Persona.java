public class Persona {

    private String nombre;

    public static void mostrarNombre() {
        System.out.println("Nombre: " + nombre); // Error: acceso a atributo no estático desde método estático
    }
}