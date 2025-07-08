public abstract class Objeto{
    public abstract double calcularArea();

    public void mostrarArea(){
        System.out.println("Area: " + calcularArea());
    }
}
