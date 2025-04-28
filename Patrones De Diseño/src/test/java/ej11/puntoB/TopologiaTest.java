package ej11.puntoB;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopologiaTest {
    private Topologia agua;
    private Topologia tierra;
    private Topologia pantano;
    private Topologia mixta1;
    private Topologia mixta2;


    @BeforeEach
    void setUp() {
        agua = new Agua();
        tierra = new Tierra();
        pantano = new Pantano();
        mixta1 = new Mixta(agua, tierra, pantano, tierra);
        mixta2 = new Mixta(agua, tierra, tierra, mixta1);
    }

    @Test
    void testProporcionAgua() {
        assertEquals(1, agua.proporcionAgua());
        assertEquals(0, tierra.proporcionAgua());
        assertEquals(0.7, pantano.proporcionAgua());
        assertEquals(0.425, mixta1.proporcionAgua());
        assertEquals(0.35625, mixta2.proporcionAgua());
    }
}
