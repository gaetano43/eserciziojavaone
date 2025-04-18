package esercizio;

/**
 * Rappresenta un triangolo.
 * @param height altezza
 * @param length base
 */
public record Triangle(Double height, Double length) implements Shape {

    @Override
    public String draw() {
        return "Sto disegnando un triangolo. Altezza: " + height + " Lunghezza: " + length;
    }

    @Override
    public double calcolaArea() {
        return 0.5 * height * length;
    }
}
