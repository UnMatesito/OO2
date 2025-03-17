package oo2.ej2.parte2;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        juego6 = new Juego(new Lagarto(), new Piedra());
        juego7 = new Juego(new Spock(), new Tijeras());
        juego8 = new Juego(new Lagarto(), new Spock());
    }

    @Test
    void testJugar() {
        assertEquals("Piedra", juego.jugar());
        assertEquals("Piedra", juego2.jugar());
        assertEquals("Papel", juego3.jugar());
        assertEquals("Papel", juego4.jugar());
        assertEquals("Tijeras", juego5.jugar());
        assertEquals("Piedra", juego6.jugar());
        assertEquals("Spock", juego7.jugar());
        assertEquals("Lagarto", juego8.jugar());
    }
}
