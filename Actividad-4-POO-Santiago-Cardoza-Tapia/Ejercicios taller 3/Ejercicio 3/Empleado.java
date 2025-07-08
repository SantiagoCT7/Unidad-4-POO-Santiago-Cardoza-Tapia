public class Empleado {
    private String nombre;
    private int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public static void metodoCorrecto(Empleado e) {
        e.nombre = "Luis";
        e.edad = 30;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        Empleado emp = new Empleado("Ana", 40);
        emp.mostrarDetalles();
        System.out.println();
        metodoCorrecto(emp);
        emp.mostrarDetalles();
    }
}
