public class Persona4{
    protected String nombre;
    protected int edad;

    public Persona4(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
