public class Estudiante{
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante(){
        this("Sin nombre", 0);
        this.curso = "Sin curso";
    }

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Sin curso";
    }

    public Estudiante(String nombre, int edad, String curso){
        this(nombre, edad);
        this.curso = curso;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
    }

    public static void main(String[] args){
        Estudiante e1 = new Estudiante();
        e1.mostrarDetalles();

        System.out.println();

        Estudiante e2 = new Estudiante("Santiago", 18);
        e2.mostrarDetalles();

        System.out.println();

        Estudiante e3 = new Estudiante("Jhon", 18, "Ingenieria de software");
        e3.mostrarDetalles();
    }
}
