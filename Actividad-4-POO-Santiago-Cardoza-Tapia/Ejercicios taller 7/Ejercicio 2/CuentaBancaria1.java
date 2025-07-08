public class CuentaBancaria1{
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria1(String numeroCuenta, double saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        }
    }

    public void mostrarDetalles(){
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
    }
}
