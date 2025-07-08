public class EmpleadoTest {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Ana", 5000);
        System.out.println("Nombre: " + emp.nombre);
        System.out.println("Salario: " + emp.getSalario());
    }
}
