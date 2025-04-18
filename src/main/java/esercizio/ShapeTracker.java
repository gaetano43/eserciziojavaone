package esercizio;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Tiene traccia delle forme e del momento in cui sono state create.
 */
public class ShapeTracker {

    private final Map<Shape, LocalDateTime> shapeMap = new HashMap<>();

    /**
     * Aggiunge una forma alla mappa, associandola al momento corrente.
     */
    public void addShape(Shape shape) {
        shapeMap.put(shape, LocalDateTime.now());
    }

    /**
     * Stampa tutte le forme e il momento in cui sono state aggiunte.
     */
    public void stampaMappa() {
        shapeMap.forEach((shape, time) ->
                System.out.println(shape.draw() + " → Aggiunta il: " + time)
        );
    }
}
