package ej11.puntoA;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TopologiaTest {
    private Topologia topologia;
    private Topologia topologia2;
    private Topologia topologia3;
    private Topologia topologia4;
    private Topologia topologia5;

    @BeforeEach
    void setUp() {
         topologia = new Agua();
         topologia2 = new Tierra();
         topologia3 = new Mixta(topologia, topologia2, topologia, topologia2);
         topologia4 = new Mixta(topologia, topologia2, topologia2, topologia3);
         topologia5 = new Mixta(topologia3, topologia2, topologia2, topologia);
    }

    @Test
    void testProporcionAgua() {
        assertEquals(1, topologia.proporcionAgua());
        assertEquals(0, topologia2.proporcionAgua());
        assertEquals(0.5, topologia3.proporcionAgua());
        assertEquals(0.375, topologia4.proporcionAgua());
    }

    @Test
    void testIguales() {
        assertTrue(topologia4.equals(topologia5));
    }
}
