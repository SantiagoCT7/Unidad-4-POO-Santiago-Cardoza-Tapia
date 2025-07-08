public class Persona6{
    String nombre;
    int edad;

    public Persona6(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}