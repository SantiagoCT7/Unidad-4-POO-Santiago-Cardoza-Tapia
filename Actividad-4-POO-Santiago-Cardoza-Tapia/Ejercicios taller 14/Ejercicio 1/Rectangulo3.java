public class Rectangulo3 extends Figura3{
    private double base;
    private double altura;

    public Rectangulo3(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(){
        System.out.println("area del rectangulo-cuadrado: " + (base * altura));
    }
}
