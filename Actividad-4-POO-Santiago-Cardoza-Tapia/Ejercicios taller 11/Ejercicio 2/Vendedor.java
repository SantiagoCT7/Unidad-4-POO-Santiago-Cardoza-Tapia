public class Vendedor extends Empleado6{
    private double ventas;
    private double comision;

    public Vendedor(String nombre, double ventas, double comision){
        super(nombre);
        this.ventas = ventas;
        this.comision = comision;
    }

    public double calcularSalario(){
        return ventas * comision;
    }
}
