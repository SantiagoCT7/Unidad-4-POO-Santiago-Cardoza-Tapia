public class Empleado4 extends Persona6{
    String departamento;

    public Empleado4(String nombre, int edad, String departamento){
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}