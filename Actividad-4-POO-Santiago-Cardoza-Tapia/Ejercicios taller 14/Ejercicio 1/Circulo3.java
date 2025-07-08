public class Circulo3 extends Figura3{
    private double radio;

    public Circulo3(double radio){
        this.radio = radio;
    }

    public void calcularArea(){
        System.out.println("area del circulo: " + (Math.PI * radio * radio));
    }
}
