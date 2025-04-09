package ej2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoPlantaTest {
    private Planta empleadoPlanta;

    @BeforeEach
    void setUp() {
        empleadoPlanta = new Planta(3, false, 3);
    }

    @Test
    void testSueldo(){
        assertEquals(54900, empleadoPlanta.sueldo());
    }
}
