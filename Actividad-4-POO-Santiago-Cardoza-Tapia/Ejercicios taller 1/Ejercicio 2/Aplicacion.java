import java.util.Scanner;

public class Aplicacion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("LIBRO:");
        System.out.print("Ingrese titulo: ");
        String titulo = sc.nextLine();
        System.out.print("Ingrese autor: ");
        String autor = sc.nextLine();
        System.out.print("Ingrese número de paginas: ");
        int paginas = sc.nextInt();
        sc.nextLine();
        Libro libro = new Libro(titulo, autor, paginas);
        System.out.println(libro.toString());

        System.out.println();

        System.out.println("Cuenta bancaria:");
        System.out.print("Ingrese numero de cuenta: ");
        String numeroCuenta = sc.nextLine();
        System.out.print("Ingrese tipo de cuenta: ");
        String tipoCuenta = sc.nextLine();
        System.out.print("Ingrese saldo inicial: ");
        double saldo = sc.nextDouble();
        sc.nextLine();
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);
        System.out.println(cuenta.toString());

        System.out.println();

        System.out.println("Estudiante:");
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese curso: ");
        String curso = sc.nextLine();
        Estudiante estudiante = new Estudiante(nombre, edad, curso);
        System.out.println(estudiante.toString());

        sc.close();
    }
}

class Libro{
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

    public String toString(){
        return "Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + numeroPaginas;
    }
}

class CuentaBancaria{
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public CuentaBancaria(){
        this.numeroCuenta = "00000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Sin definir";
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public String toString(){
        return "Numero Cuenta: " + numeroCuenta + ", Saldo: $" + saldo + ", Tipo: " + tipoCuenta;
    }
}

class Estudiante{
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante(){
        this("Sin nombre", 0);
        this.curso = "Sin curso";
    }

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Sin curso";
    }

    public Estudiante(String nombre, int edad, String curso){
        this(nombre, edad);
        this.curso = curso;
    }

    public String toString(){
        return "Nombre: " + nombre + ", Edad: " + edad + ", Curso: " + curso;
    }
}
