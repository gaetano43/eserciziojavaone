package esercizio;

/**
 * Rappresenta un rettangolo.
 * @param height altezza
 * @param length lunghezza
 */
public record Rectangle(Double height, Double length) implements Shape {

    @Override
    public String draw() {
        return "Sto disegnando un rettangolo. Altezza: " + height + " Lunghezza: " + length;
    }

    @Override
    public double calcolaArea() {
        return height * length;
    }
}
