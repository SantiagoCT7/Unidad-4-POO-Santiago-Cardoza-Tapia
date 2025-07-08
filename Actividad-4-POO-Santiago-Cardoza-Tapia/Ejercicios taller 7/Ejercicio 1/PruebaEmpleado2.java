public class PruebaEmpleado2{
    public static void main(String[] args){
        Empleado2 e = new Empleado2();
        e.nombre = "Santiago";
        e.setSalario(6942024);

        System.out.println("Nombre: " + e.nombre);
        System.out.println("Salario: " + e.getSalario());
    }
}
