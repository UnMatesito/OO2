package ej2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoPasanteTest {
    private Pasante pasante;

    @BeforeEach
    void setUp() {
        pasante = new Pasante(4);
    }

    @Test
    void testSueldo(){
        assertEquals(25000, pasante.sueldo());
    }
}
