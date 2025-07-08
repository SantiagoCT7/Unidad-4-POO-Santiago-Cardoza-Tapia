public class Persona {

    private String nombre;

    public static void mostrarNombre() {
        System.out.println(this.nombre); // Error: No se puede usar `this` en un contexto estático
    }
}