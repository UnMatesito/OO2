package oo2.ej2.parte1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestJuego {
    private Juego juego;
    private Juego juego2;
    private Juego juego3;
    private Juego juego4;
    private Juego juego5;
    private Juego juego6;
    private Juego juego7;
    private Juego juego8;

    @BeforeEach
    void setUp() {
        juego = new Juego(new Piedra(), new Tijeras());
        juego2 = new Juego(new Tijeras(), new Piedra());
        juego3 = new Juego(new Papel(), new Piedra());
        juego4 = new Juego(new Piedra(), new Papel());
        juego5 = new Juego(new Tijeras(), new Papel());
        juego6 = new Juego(new Piedra(), new Piedra());
        juego7 = new Juego(new Papel(), new Papel());
        juego8 = new Juego(new Tijeras(), new Tijeras());
    }

    @Test
    void testJuego() {
        Assertions.assertEquals("Piedra", juego.jugar());
        Assertions.assertEquals("Piedra", juego2.jugar());
        Assertions.assertEquals("Papel", juego3.jugar());
        Assertions.assertEquals("Papel", juego4.jugar());
        Assertions.assertEquals("Tijeras", juego5.jugar());
        Assertions.assertEquals("Empate", juego6.jugar());
        Assertions.assertEquals("Empate", juego7.jugar());
        Assertions.assertEquals("Empate", juego8.jugar());
    }
}
