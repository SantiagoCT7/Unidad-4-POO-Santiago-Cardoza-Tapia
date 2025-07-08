public class Empleado {

    private double salario;
}

class Main {
    public static void main(String[] args) {
        Empleado e = new Empleado();
        // System.out.println(e.salario); // Error: acceso directo a atributo privado
    }
}