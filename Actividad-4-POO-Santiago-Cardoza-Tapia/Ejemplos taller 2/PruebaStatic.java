public class PruebaStatic {

    private String dato;

    public static void metodoEstatico() {
        // Error: `this` no puede usarse en un método estático
        System.out.println(this.dato);
    }
}