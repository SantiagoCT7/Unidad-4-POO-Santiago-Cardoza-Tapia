public class Poligonos extends Forma{
    private double base;
    private double altura;

    public Poligonos(double base, double altura){
    super(0);
    this.base = base;
    this.altura = altura;
}

    public double calcularArea(){
        return base * altura;
    }
}