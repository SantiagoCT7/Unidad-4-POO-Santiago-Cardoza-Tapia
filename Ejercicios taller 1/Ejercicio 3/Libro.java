public class Libro{

    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(){
        this.titulo = "Sin titulo";
        this.autor = "Desconocido";
        this.numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void mostrarDetalles(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de páginas: " + numeroPaginas);
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }

    public static void main(String[] args){

        Libro libro1 = new Libro();
        libro1.mostrarDetalles();

        System.out.println();

        Libro libro2 = new Libro("No tengo boca y debo gritar", "Harlan Ellison", 169);
        libro2.mostrarDetalles();
    }
}
