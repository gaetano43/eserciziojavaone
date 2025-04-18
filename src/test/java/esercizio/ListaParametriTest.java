package esercizio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListaParametriTest {

    @Test
    public void testPrimo() {
        assertEquals(2.0, ListaParametri.primo());
    }

    @Test
    public void testUltimo() {
        assertEquals(6.5, ListaParametri.ultimo());
    }
}
