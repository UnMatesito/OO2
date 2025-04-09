package ej2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTemporarioTest {
    private Temporario temporario;

    @BeforeEach
    void setUp(){
        temporario = new Temporario(2,true,500);
    }

    @Test
    void testSueldo(){
        assertEquals(156450, temporario.sueldo());
    }
}
