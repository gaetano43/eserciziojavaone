package esercizio;

/**
 * Rappresenta un cerchio.
 * @param radius raggio del cerchio.
 */
public record Circle(Double radius) implements Shape {

    @Override
    public String draw() {
        return "Sto disegnando un cerchio. Raggio: " + radius;
    }

    @Override
    public double calcolaArea() {
        return Math.PI * radius * radius;
    }
}
