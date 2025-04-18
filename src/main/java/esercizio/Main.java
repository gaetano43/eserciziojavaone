package esercizio;


import java.util.*;

/**
 * Classe principale che gestisce la creazione di oggetti Shape,
 * calcola le aree totali e tiene traccia delle forme create con timestamp.
 */
public class Main {
    public static void main(String[] args) {

        // Lista di oggetti Shape
        List<Shape> shapes = new ArrayList<>();

        // === Creazione forme tramite factory pattern ===
        System.out.println("============================");
        for (ShapeType type : ShapeType.values()) {
            Shape shape = createShape(type); // Crea forma dal tipo enum
            add(shape, shapes);              // Aggiunge alla lista
            System.out.println(shape.draw()); // Stampa la descrizione
        }
        System.out.println("============================");

        // === Tracciamento delle forme con data/ora ===
        ShapeTracker tracker = new ShapeTracker();
        for (Shape shape : shapes) {
            tracker.addShape(shape);
        }
        tracker.stampaMappa();

        // === Calcolo totale delle aree ===
        Double areaTot = areaTot(shapes);
        System.out.println("Somma delle aree: " + areaTot);
    }

    /**
     * Crea una forma usando il factory pattern.
     */
    public static Shape createShape(ShapeType type){
        return ShapeFactory.createShape(type);
    }

    /**
     * Aggiunge una forma alla lista.
     * @return true se aggiunta con successo.
     */
    public static boolean add(Shape shape, List<Shape> shapes){
        return shapes.add(shape);
    }

    /**
     * Calcola la somma totale delle aree di una lista di forme.
     */
    public static Double areaTot(List<Shape> shapes){
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calcolaArea();
        }
        return sum;
    }
}
