public class PruebaCuentaBancaria1{
    public static void main(String[] args){
        CuentaBancaria1 cuenta = new CuentaBancaria1("420", 5000, "Ahorros");

        cuenta.mostrarDetalles();
        cuenta.setSaldo(6000);

        System.out.println();

        cuenta.mostrarDetalles();

    }
}
