public class Estudiante5 extends Persona5{
    private String matricula;

    public Estudiante5(String nombre, int edad, String matricula){
        super(nombre, edad);
        this.matricula = matricula;
    }

    public void mostrarDatos(){

        System.out.println("Matricula: " + matricula);
    }
}
