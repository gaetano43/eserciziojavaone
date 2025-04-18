package esercizio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTrackerTest {

    @Test
    public void testAddShapeAndPrint() {
        ShapeTracker tracker = new ShapeTracker();
        Shape shape = new Circle(2.0);
        tracker.addShape(shape);
        assertDoesNotThrow(tracker::stampaMappa); // solo per evitare eccezioni
    }
}
