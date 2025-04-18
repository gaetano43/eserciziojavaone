package esercizio;

/**
 * Classe factory per creare forme in base al tipo specificato.
 */
public class ShapeFactory {

    /**
     * Crea una forma in base al tipo fornito.
     */
    public static Shape createShape(ShapeType type) {
        return switch (type) {
            case CIRCLE -> new Circle(ListaParametri.primo());
            case RECTANGLE -> new Rectangle(ListaParametri.ultimo(), ListaParametri.get(2));
            case TRIANGLE -> new Triangle(ListaParametri.get(3), ListaParametri.get(4));
        };
    }
}

