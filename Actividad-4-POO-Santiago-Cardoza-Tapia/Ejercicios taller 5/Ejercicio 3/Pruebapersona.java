//ejercicio 5.3
public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona();
        
        p.setNombre("Santiago");
        p.edad = 18;
        System.out.println("Nombre: " + p.getNombre() + ", Edad: " + p.edad);
    }
}
