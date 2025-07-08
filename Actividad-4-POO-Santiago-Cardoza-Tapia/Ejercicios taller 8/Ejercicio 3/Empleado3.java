public class Empleado3{
    protected String nombre;
    protected double salario;

    public Empleado3(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}
