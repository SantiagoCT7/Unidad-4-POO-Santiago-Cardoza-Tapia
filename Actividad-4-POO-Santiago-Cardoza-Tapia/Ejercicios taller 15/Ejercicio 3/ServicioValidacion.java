public class ServicioValidacion {
    public boolean validarUsuario(Usuario1 usuario) {
        return usuario.getNombreUsuario() != null && !usuario.getNombreUsuario().isEmpty()
               && usuario.getContraseña() != null && usuario.getContraseña().length() >= 6;
    }
}
