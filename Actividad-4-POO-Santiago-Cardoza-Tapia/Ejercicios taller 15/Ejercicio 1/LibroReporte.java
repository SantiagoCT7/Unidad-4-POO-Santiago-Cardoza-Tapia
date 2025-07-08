public class LibroReporte{
    public void generarReporte(Libro1 libro){
        System.out.println("Reporte del Libro:");
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Páginas: " + libro.getPaginas());
    }
}
