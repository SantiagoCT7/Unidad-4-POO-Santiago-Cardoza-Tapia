public class PruebaUsuario1 {
    public static void main(String[] args) {
        Usuario1 usuario = new Usuario1("Santiago", "NoPondreNingunaContraseña");
        ServicioValidacion validador = new ServicioValidacion();
        ServicioAutenticacion autenticador = new ServicioAutenticacion();

        if (validador.validarUsuario(usuario)) {
            if (autenticador.autenticar(usuario, "NoPondreNingunaContraseña")) {
                System.out.println("Acceso concedido.");
            } else {
                System.out.println("Contraseña incorrecta.");
            }
        } else {
            System.out.println("Datos inválidos.");
        }
    }
}
