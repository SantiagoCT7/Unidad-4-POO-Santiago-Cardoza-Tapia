public class Estudiante1{
    private String nombre;
    private int edad;

    public Estudiante1() {
        this("Sin nombre", 0);
    }

    public Estudiante1(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args){
        Estudiante1 e1 = new Estudiante1();
        e1.mostrarDetalles();

        System.out.println();

        Estudiante1 e2 = new Estudiante1("Santiago", 18);
        e2.mostrarDetalles();
    }
}
