public abstract class Empleado6{
    protected String nombre;

    public Empleado6(String nombre){
        this.nombre = nombre;
    }

    public abstract double calcularSalario();

    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + calcularSalario());
    }
}
