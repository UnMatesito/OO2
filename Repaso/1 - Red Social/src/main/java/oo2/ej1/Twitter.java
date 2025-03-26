package oo2.ej1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
    private List<Usuario> usuarios;

    public Twitter() {
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        if (mismoUsuario(usuario.getScreenName())) {
            this.usuarios.add(usuario);
        }
    }

    public void eliminarUsuario(Usuario usuario){
        usuario.eliminarTweets();
        this.usuarios.remove(usuario);
    }

    public List<Usuario> getUsuarios() {
        return new ArrayList<>(this.usuarios);
    }

    private boolean mismoUsuario(String screenName){
        return this.usuarios.stream().noneMatch(u -> u.tieneNombre(screenName));
    }
}
