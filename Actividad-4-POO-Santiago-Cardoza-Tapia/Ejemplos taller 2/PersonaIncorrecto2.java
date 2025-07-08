public class Persona {

    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre; // `this` necesario

        // Uso innecesario de `this` dentro de un método sin ambigüedad
        this.mostrarNombre(); // Aunque compila, `this` aquí es innecesario
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre); // `this` no es necesario aquí
    }
}