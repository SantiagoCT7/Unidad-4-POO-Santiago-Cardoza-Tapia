public class Matematicas {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return b != 0 ? a / b : 0;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Suma: " + Matematicas.sumar(5, 3));
        System.out.println("Resta: " + Matematicas.restar(5, 3));
        System.out.println("Multiplicación: " + Matematicas.multiplicar(5, 3));
        System.out.println("División: " + Matematicas.dividir(10, 2));
    }
}