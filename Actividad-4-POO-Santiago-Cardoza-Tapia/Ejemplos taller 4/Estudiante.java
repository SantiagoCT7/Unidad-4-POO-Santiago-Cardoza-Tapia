public class Estudiante {

    private String nombre;
    private int edad;
    private double notaPromedio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0 && notaPromedio <= 5.0) {
            this.notaPromedio = notaPromedio;
        }
    }
}

class TestEstudiante {
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        e.setNombre("Luis");
        e.setEdad(20);
        e.setNotaPromedio(4.2);

        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Edad: " + e.getEdad());
        System.out.println("Nota Promedio: " + e.getNotaPromedio());
    }
}