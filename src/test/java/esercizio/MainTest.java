package esercizio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testAreaTot() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(1.0));
        shapes.add(new Circle(2.0));

        Double result = Main.areaTot(shapes);

        assertEquals(Math.PI * 5, result, 0.01);
    }

    @Test
    public void testAdd() {
        List<Shape> shapes = new ArrayList<>();
        Shape circle = new Circle(2.0);
        assertTrue(Main.add(circle, shapes));
        assertEquals(1, shapes.size());
    }
}
