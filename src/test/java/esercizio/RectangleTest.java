package esercizio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void testArea() {
        Shape rectangle = new Rectangle(5.0, 3.0);
        assertEquals(15.0, rectangle.calcolaArea());
    }

    @Test
    public void testDraw() {
        Shape rectangle = new Rectangle(5.0, 3.0);
        assertTrue(rectangle.draw().contains("rettangolo"));
    }
}
