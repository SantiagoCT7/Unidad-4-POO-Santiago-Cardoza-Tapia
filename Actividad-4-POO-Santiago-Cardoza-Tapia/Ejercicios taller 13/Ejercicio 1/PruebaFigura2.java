public class PruebaFigura2{
    public static void main(String[] args){
        Figura2 f1 = new Rectangulo2(5, 8);
        Figura2 f2 = new Triangulo(6, 4);

        System.out.println(f1.calcularArea());
        System.out.println(f2.calcularArea());
    }
}
