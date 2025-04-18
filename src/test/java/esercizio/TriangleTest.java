package esercizio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    public void testArea() {
        Shape triangle = new Triangle(4.0, 6.0);
        assertEquals(12.0, triangle.calcolaArea());
    }

    @Test
    public void testDraw() {
        Shape triangle = new Triangle(4.0, 6.0);
        assertTrue(triangle.draw().contains("triangolo"));
    }
}
