public class Persona3{
    protected String nombre;
    protected int edad;

    public Persona3(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
