package esercizio;


/**
 * Interfaccia che rappresenta una forma geometrica disegnabile e calcolabile.
 */
public interface Shape {
    /**
     * Ritorna una descrizione testuale della forma.
     */
    String draw();

    /**
     * Calcola l'area della forma.
     */
    double calcolaArea();
}
