package ej1.puntoA;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {
    private Socio socio1;
    private Socio socio2;
    private VoorheesExporter exporter;
    private Biblioteca biblioteca;

    @BeforeEach
    void setUp(){
        socio1 = new Socio("Pepe", "pepe@gmail.com", "7574-3");
        socio2 = new Socio("Maria", "maria@gmail.com", "1433-1");
        biblioteca = new Biblioteca();
        biblioteca.agregarSocio(socio1);
        biblioteca.agregarSocio(socio2);
        exporter = new VoorheesExporter();
        biblioteca.setExporter(exporter);
    }

    @Test
    void testExporter(){
        String json = biblioteca.exportarSocios();
        assertTrue(json.contains("Maria") && json.contains("Pepe"));
    }
}
