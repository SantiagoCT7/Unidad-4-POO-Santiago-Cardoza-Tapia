public class Profesor{
    private String nombre;
    private int edad;

    public Profesor() {
        this("Sin nombre", 0);
    }

    public Profesor(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void metodoEstaticoCorrecto(Profesor p){
        System.out.println("Nombre: " + p.nombre);
        System.out.println("Edad: " + p.edad);
    }

    public static void main(String[] args){
        Profesor p1 = new Profesor("jhon", 99);
        p1.mostrarDetalles();

        System.out.println();

        metodoEstaticoCorrecto(p1);
    }
}
