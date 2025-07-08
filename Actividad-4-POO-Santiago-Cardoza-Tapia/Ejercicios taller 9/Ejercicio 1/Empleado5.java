public class Empleado5 extends Persona7{
    private String departamento;

    public Empleado5(String nombre, String departamento){
        super(nombre);
        this.departamento = departamento;
    }

    public void mostrarDetalles() {
        System.out.println("Departamento: " + departamento);
    }
}
