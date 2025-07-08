public class Forma extends Objeto{
    private double radio;

    public Forma(double radio){
        this.radio = radio;
    }

    public double calcularArea(){
        return Math.PI * radio * radio;
    }
}
