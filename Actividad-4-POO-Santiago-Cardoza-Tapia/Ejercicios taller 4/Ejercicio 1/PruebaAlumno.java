public class PruebaAlumno{
    public static void main(String[] args){
        Alumno a1 = new Alumno();
        a1.setNombre("Santiago");
        a1.setEdad(18);
        a1.setNotaPromedio(5);

        System.out.println("Nombre: " + a1.getNombre());
        System.out.println("Edad: " + a1.getEdad());
        System.out.println("Nota Promedio: " + a1.getNotaPromedio());
    }
}
