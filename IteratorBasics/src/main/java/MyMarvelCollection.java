import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clase que representa una colección de películas de Marvel.
 */
public class MyMarvelCollection implements Iterable<Film> {
    private List<Film> films;

    // Constructor
    public MyMarvelCollection() {
        this.films = new ArrayList<>();
    }

    // Constructor que recibe una lista de películas inicial
    public MyMarvelCollection(List<Film> films) {
        this.films = new ArrayList<>(films);
    }

    // Método para agregar una película a la colección
    public void add(Film film) {
        films.add(film);
    }

    // Método para obtener el iterador de la colección
    @Override
    public Iterator<Film> iterator() {
        return films.iterator();
    }
}
