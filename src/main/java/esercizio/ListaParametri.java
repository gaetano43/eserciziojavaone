package esercizio;

import java.util.List;

/**
 * Classe di supporto per fornire parametri numerici alle forme.
 */
public class ListaParametri {

    // Lista statica di valori double
    public static final List<Double> LISTA = List.of(2.0, 3.0, 4.0, 5.0, 10.0, 6.5);

    /**
     * Ritorna il primo valore della lista.
     */
    public static Double primo() {
        return LISTA.getFirst();
    }

    /**
     * Ritorna l'ultimo valore della lista.
     */
    public static Double ultimo() {
        return LISTA.getLast();
    }

    /**
     * Ritorna l'elemento alla posizione indicata, con controllo.
     */
    public static Double get(int index) {
        if (index < 0 || index >= LISTA.size()) throw new IllegalArgumentException("Indice non valido: " + index);
        return LISTA.get(index);
    }
}
