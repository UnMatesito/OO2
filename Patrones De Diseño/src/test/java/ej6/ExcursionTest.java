package ej6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExcursionTest {
    private Excursion excursion;
    private Usuario usuario1;
    private Usuario usuario2;

    @BeforeEach
    void setUp() {
        excursion = new Excursion("Dos dias en kayak", LocalDate.of(2025,5,12), LocalDate.of(2025, 5, 13), "Pepe", 60000, 1, 2);
        usuario1 = new Usuario("Pepe", "Argento", "pepeargento@gmail.com");
        usuario2 = new Usuario("Monica", "Argento", "moniargento@gmail.com");
    }

    @Test
    void testExcursionLlena() {
        excursion.inscribirUsuario(usuario1);
        excursion.inscribirUsuario(usuario2);
        assertTrue(excursion.getEstado() instanceof EstadoLleno);
    }

    @Test
    void testExcursionDefinitiva(){
        excursion.inscribirUsuario(usuario1);
        assertTrue(excursion.getEstado() instanceof EstadoDefinitivo);
    }
}
