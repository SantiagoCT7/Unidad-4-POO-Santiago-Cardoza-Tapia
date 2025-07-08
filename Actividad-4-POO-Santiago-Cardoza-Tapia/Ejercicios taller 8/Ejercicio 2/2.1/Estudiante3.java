public class Estudiante3 extends Persona3{
    private String matricula;

    public Estudiante3(String nombre, int edad, String matricula){
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Matricula: " + matricula);
    }
}
