public class Gerente extends Empleado {
    private String departamento;

    @Override
    public void mostrarNombre() {
        super.mostrarNombre();
        System.out.println("Departamento: " + departamento);
    }
}