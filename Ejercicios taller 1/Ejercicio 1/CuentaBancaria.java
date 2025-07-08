public class CuentaBancaria{
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public CuentaBancaria(){
        this.numeroCuenta = "00000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Sin definir";
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public void mostrarDetalles(){
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }

    public static void main(String[] args){
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.mostrarDetalles();

        System.out.println();

        CuentaBancaria cuenta2 = new CuentaBancaria("12345678", "Ahorros");
        cuenta2.mostrarDetalles();

        System.out.println();

        CuentaBancaria cuenta3 = new CuentaBancaria("1234", 42069, "Corriente");
        cuenta3.mostrarDetalles();
    }
}
