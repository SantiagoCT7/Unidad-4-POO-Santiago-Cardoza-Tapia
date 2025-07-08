public class Gerente1 extends Empleado6{
    private double salarioBase;

    public Gerente1(String nombre, double salarioBase){
        super(nombre);
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return salarioBase + (salarioBase * 0.5);
    }
}
