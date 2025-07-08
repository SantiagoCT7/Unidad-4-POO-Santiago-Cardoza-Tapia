public class PruebaLibro1{
    public static void main(String[] args){
        Libro1 libro = new Libro1("No tengo boca y debo gritar", "Harlan Ellison", 162);
//tal vez se dio cuenta que ya hice mencion a este libro en uno de mis trabajos anteriores y aunque no me he leido el libro de el si puedo
//decir que la historia es interezante, he escuchado sobre el y me gusta su contenido, por eso lo pongo aqui
        LibroReporte reporte = new LibroReporte();
        LibroPersistencia persistencia = new LibroPersistencia();

        reporte.generarReporte(libro);
        persistencia.guardarLibro(libro);
    }
}
