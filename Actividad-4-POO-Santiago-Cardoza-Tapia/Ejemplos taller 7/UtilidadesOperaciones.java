public class UtilidadesOperaciones {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b != 0) return (double) a / b;
        else throw new ArithmeticException("División por cero");
    }
}
