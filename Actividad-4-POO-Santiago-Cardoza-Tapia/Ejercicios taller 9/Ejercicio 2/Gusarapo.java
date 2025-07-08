public class Gusarapo extends Animal{
    private String tipoDeAgua;

    public Gusarapo(String especie, String tipoDeAgua){
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }

    public void mostrarDetalles(){
        super.mostrarEspecie();
        System.out.println("Tipo de Agua: " + tipoDeAgua);
    }
}
