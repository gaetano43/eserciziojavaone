package esercizio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeFactoryTest {

    @Test
    public void testCreateCircle() {
        Shape shape = ShapeFactory.createShape(ShapeType.CIRCLE);
        assertTrue(shape instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        Shape shape = ShapeFactory.createShape(ShapeType.RECTANGLE);
        assertTrue(shape instanceof Rectangle);
    }

    @Test
    public void testCreateTriangle() {
        Shape shape = ShapeFactory.createShape(ShapeType.TRIANGLE);
        assertTrue(shape instanceof Triangle);
    }

    @Test
    public void testCreateShapeWithNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> ShapeFactory.createShape(null));
    }
}
