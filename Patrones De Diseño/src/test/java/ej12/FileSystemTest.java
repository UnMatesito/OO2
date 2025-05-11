package ej12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileSystemTest {
    private FileSystem fileSystem;
    private Directorio directorio1;
    private Directorio directorio2;
    private Directorio directorio3;
    private Archivo archivo1;
    private Archivo archivo2;
    private Archivo archivo3;

    @BeforeEach
    void setUp() {
        fileSystem = new FileSystem();
        directorio1 = new Directorio("Directorio1", LocalDate.now());
        directorio2 = new Directorio("Directorio1.1", LocalDate.now());
        directorio3 = new Directorio("Directorio2", LocalDate.now());
        archivo1 = new Archivo("Archivo1", LocalDate.of(2023, 4, 2), 100);
        archivo2 = new Archivo("Archivo2", LocalDate.of(2024, 4, 2), 200);
        archivo3 = new Archivo("Archivo3", LocalDate.now(), 300);
        directorio1.agregarElemento(directorio2);
        directorio2.agregarElemento(archivo1);
        directorio3.agregarElemento(archivo2);
        fileSystem.agregarElemento(directorio1);
        fileSystem.agregarElemento(directorio3);
        fileSystem.agregarElemento(archivo3);
    }

    @Test
    void testTamañoTotalOcupado() {
        assertEquals(696, fileSystem.tamañoTotalOcupado());
    }

    @Test
    void testArchivoMasGrande() {
        assertEquals(archivo3, fileSystem.archivoMasGrande());
    }

    @Test
    void testArchivoMasReciente() {
        assertEquals(archivo3, fileSystem.archivoMasNuevo());
    }

    @Test
    void testBuscar() {
        assertTrue(fileSystem.buscar("Archivo1") == archivo1);
    }
    // TODO: Consultar porque no pasa este test
}
