public class Main {
    public static void main(String[] args) {
        // Creamos una colección de películas de Marvel
        MyMarvelCollection myCol = new MyMarvelCollection();

        // Agregamos películas a la colección
        myCol.add(new Film("Ironman", 2008));
        myCol.add(new Film("Captain America", 2010));
        myCol.add(new Film("The Avengers", 2012));

        // Iteramos sobre la colección usando un iterador
        var iterator = myCol.iterator();
        System.out.println("Iterating with iterator...");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iteramos sobre la colección usando un bucle for mejorado
        System.out.println("\nIterating with for loop...");
        for (var film : myCol) {
            System.out.println(film);
        }
    }
}
