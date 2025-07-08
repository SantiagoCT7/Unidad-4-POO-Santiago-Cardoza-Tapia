public class CuentaTest {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456", 1000, "Ahorros");
        cuenta.mostrarDetalles();
        // System.out.println(cuenta.numeroCuenta); // Error de compilación
    }
}
