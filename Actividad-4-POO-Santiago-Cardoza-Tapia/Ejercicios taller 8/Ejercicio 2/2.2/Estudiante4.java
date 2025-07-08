public class Estudiante4 extends Persona4{
    private String matricula;

    public Estudiante4(String nombre, int edad, String matricula){
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Matricula: " + matricula);
    }
}
