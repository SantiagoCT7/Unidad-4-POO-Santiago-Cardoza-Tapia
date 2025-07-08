public class Persona {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}

class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
        System.out.println(p.nombre); // Error de compilación
    }
}