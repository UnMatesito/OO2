package ej8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DispositivoTest {
    private Dispositivo dispositivo;
    private Display display;
    private Ringer ringer;
    private Connection connection;
    private CRC_Calculator crcCalculator;

    @BeforeEach
    void setUp(){
        display = new Display();
        ringer = new Ringer();
        crcCalculator = new CRC32_Calculator();
        connection = new WifiConn();
        dispositivo = new Dispositivo(connection, display, ringer, crcCalculator);
    }

    @Test
    void testSend(){
        assertEquals("hola", dispositivo.send("hola").substring(0,4));
    }

    @Test
    void testSetCRC(){
        dispositivo.setCRC(new CRC16_Calculator());
        assertTrue(dispositivo.getCrcCalculator() instanceof CRC16_Calculator);
    }

    @Test
    void testConectarCon(){
        dispositivo.setConnection(new MobileConn("4G"));
        assertTrue(dispositivo.getConnection() instanceof MobileConn);
    }
}
