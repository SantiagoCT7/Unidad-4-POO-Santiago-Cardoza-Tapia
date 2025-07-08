public class Alumno {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        if(nombre != null && !nombre.isEmpty()){
            this.nombre = nombre;
        }
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        if(edad >= 0 && edad <= 120){
            this.edad = edad;
        }
    }

    public double getNotaPromedio(){
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio){
        if(notaPromedio >= 0 && notaPromedio <= 5) {
            this.notaPromedio = notaPromedio;
        }
    }
}