package ej18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileOO2Test {
    private Decorator decorator;
    private FileOO2 file;

    @BeforeEach
    void setUp() {
        file = new FileOO2("Pepe", "txt", 50000, LocalDate.of(2025, 5, 12), LocalDate.now(), "rw-r--r--");
        decorator = new DecoratorNombre(file);
    }

    @Test
    void testExtension1() {
        Decorator decorator1 = new DecoratorExtension(decorator);
        assertEquals("Pepe - txt", decorator1.prettyPrint());
    }

    @Test
    void testExtension2() {
        Decorator decorator1 = new DecoratorFechaCreacion(decorator);
        Decorator decorator2 = new DecoratorExtension(decorator1);
        assertEquals("Pepe - 2025-05-12 - txt", decorator2.prettyPrint());
    }

    @Test
    void testExtension3() {
        Decorator decorator1 = new DecoratorTamaño(decorator);
        Decorator decorator2 = new DecoratorPermisos(decorator1);
        Decorator decorator3 = new DecoratorExtension(decorator2);
        assertEquals("Pepe - 50000 - rw-r--r-- - txt", decorator3.prettyPrint());
    }
}
