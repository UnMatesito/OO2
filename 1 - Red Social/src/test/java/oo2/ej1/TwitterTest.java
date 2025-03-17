package oo2.ej1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwitterTest {
    private Twitter twitter;
    private Usuario usuario1;
    private Usuario usuario2;
    private Usuario usuario3;

    @BeforeEach
    void setUp() {
        twitter = new Twitter();
        usuario1 = new Usuario("Alan");
        usuario2 = new Usuario("Alan");
        usuario3 = new Usuario("Brian");
    }

    @Test
    void testAgregarUsuarioNoPresente(){
        twitter.agregarUsuario(usuario1);
        assertEquals(1, twitter.getUsuarios().size());
    }

    @Test
    void testAgregarUsuarioPresente(){
        twitter.agregarUsuario(usuario1);
        twitter.agregarUsuario(usuario2);
        assertEquals(1, twitter.getUsuarios().size());
    }

    @Test
    void testEliminarUsuario(){
        twitter.agregarUsuario(usuario1);
        twitter.agregarUsuario(usuario3);
        Tweet tweet = new Tweet("Hola");
        usuario1.realizarTweet(tweet);
        assertEquals(1, usuario1.getTweets().size());
        twitter.eliminarUsuario(usuario1);
        assertEquals(0, usuario1.getTweets().size());
        assertEquals(1, twitter.getUsuarios().size());
    }
}
