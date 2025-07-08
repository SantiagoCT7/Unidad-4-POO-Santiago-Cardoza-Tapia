public class Empleado2{
    public String nombre;
    private double salario;

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        if(salario >= 0) {
            this.salario = salario;
        }
    }
}
