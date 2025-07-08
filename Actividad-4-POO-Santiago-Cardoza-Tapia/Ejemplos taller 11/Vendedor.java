public class Vendedor extends Empleado {

    private double comision;

    public Vendedor(String nombre, double comision) {
        super(nombre);
        this.comision = comision;
    }

    @Override
    public void calcularSalario() {
        System.out.println("El salario del vendedor incluye una comisión de: " + comision);
    }
}