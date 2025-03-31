package oo2.ej3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class PostApp {
    private List<Post> posts;

    public List<Post> ultimosPosts(Usuario user, int cantidad) {
        List<Post> postsOtrosUsuarios = getPostsOtrosUsuarios(user);
        OrdenarPostsPorFecha(postsOtrosUsuarios);
        return postsOtrosUsuarios.stream().limit(cantidad).collect(Collectors.toList());
    }

    private List<Post> getPostsOtrosUsuarios(Usuario user) {
        return posts.stream().filter(post -> post.noEsUsuario(user)).collect(Collectors.toList());
    }

    private void OrdenarPostsPorFecha(List<Post> postsOtrosUsuarios) {
        postsOtrosUsuarios.stream().sorted((p1, p2) -> p1.getFecha().compareTo(p2.getFecha())).collect(Collectors.toList());
    }
}
