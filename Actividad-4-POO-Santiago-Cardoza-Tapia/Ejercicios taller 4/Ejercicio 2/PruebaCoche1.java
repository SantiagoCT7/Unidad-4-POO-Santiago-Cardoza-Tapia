public class PruebaCoche1{
    public static void main(String[] args){
        Coche1 c = new Coche1("Honda", "Civic", 1235);

        c.acelerar(20);

        System.out.println("Marca: " + c.getMarca());
        System.out.println("Modelo: " + c.getModelo());
        System.out.println("Velocidad Máxima: " + c.getVelocidadMaxima());

    }
}
