package ej1.puntoB;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {
    private Biblioteca biblioteca;
    private Socio socio1;
    private Socio socio2;
    private VoorheesExporter exporter;
    private JsonAdaptee adaptee;

    @BeforeEach
    void setUp() {
        socio1 = new Socio("Pepe", "pepe@gmail.com", "7574-3");
        socio2 = new Socio("Maria", "maria@gmail.com", "1433-1");
        biblioteca = new Biblioteca();
        biblioteca.agregarSocio(socio1);
        biblioteca.agregarSocio(socio2);
        exporter = new VoorheesExporter();
    }

    @Test
    void testexportarSocios() throws Exception {
        String json = biblioteca.exportarSocios();

        // Parsear el JSONString en un JSONArray
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(json);

        assertEquals(2, jsonArray.size());
    }
}
