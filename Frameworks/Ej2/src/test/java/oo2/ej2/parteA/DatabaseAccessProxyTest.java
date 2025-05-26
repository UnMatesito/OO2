package oo2.ej2.parteA;

import oo2.ej2.parteA.punto1.DatabaseAccess;
import oo2.ej2.parteA.punto1.DatabaseAccessProxy;
import oo2.ej2.parteA.punto1.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

public class DatabaseAccessProxyTest {
    private DatabaseAccess db;

    @BeforeEach
    void setUp() {
        User user = new User(false);
        db = new DatabaseAccessProxy(user);
    }

    @Test
    void testAgregar() {
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.db.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.db.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testGet() {
        assertEquals(3, this.db.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.db.getSearchResults("select * from comics where id=3"));
    }
}
