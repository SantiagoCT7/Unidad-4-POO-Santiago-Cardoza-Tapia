public class Estudiante {

    private String nombre;
    private int edad;

    public Estudiante() {
        this("Sin nombre", 0);
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}