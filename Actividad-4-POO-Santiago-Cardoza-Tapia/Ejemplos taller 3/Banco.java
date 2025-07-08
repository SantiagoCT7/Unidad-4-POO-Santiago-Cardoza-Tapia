public class Banco {

    public static double tasaInteres = 0.05;

    public static void modificarTasa(double nuevaTasa) {
        tasaInteres = nuevaTasa;
    }

    public static void cambiarSaldo(double saldo) {
        saldo = saldo * (1 + tasaInteres); // No hay un atributo 'saldo', mala práctica
    }
}