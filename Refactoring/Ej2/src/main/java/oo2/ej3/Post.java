package oo2.ej3;

import java.time.LocalDate;

public class Post {
    private String texto;
    private LocalDate fecha;
    private Usuario usuario;

    public String getTexto() {
        return this.texto;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public boolean noEsUsuario(Usuario usuario) {
        return !this.usuario.getUserName().equals(usuario.getUserName());
    }
}
