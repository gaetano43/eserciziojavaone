package esercizio;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    public void testArea() {
        Shape circle = new Circle(2.0);
        assertEquals(Math.PI * 4, circle.calcolaArea(), 0.01);
    }

    @Test
    public void testDraw() {
        Shape circle = new Circle(2.0);
        assertTrue(circle.draw().contains("cerchio"));
    }
}
