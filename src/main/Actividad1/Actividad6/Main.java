package Actividad6;

import java.util.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Movie> movies = new ArrayList<>();

        // Crear algunos libros
        Book book1 = new Book("J.K. Rowling", "Harry Potter and the Philosopher's Stone", 15.99f);
        Book book2 = new Book("Stephen King", "The Shining", 12.50f);
        Book book3 = new Book("Agatha Christie", "Murder on the Orient Express", 18.75f);

        // Crear algunas películas
        Movie movie1 = new Movie("The Lord of the Rings: The Fellowship of the Ring", "Elijah Wood", "Peter Jackson", 19.99f);
        Movie movie2 = new Movie("The Shawshank Redemption", "Tim Robbins", "Frank Darabont", 14.99f);
        Movie movie3 = new Movie("Inception", "Leonardo DiCaprio", "Christopher Nolan", 17.50f);

        // Agregar libros y películas a los ArrayList
        books.add(book1);
        books.add(book2);
        books.add(book3);

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        // Imprimir listado de libros disponibles
        System.out.println("Listado de libros disponibles:");
        for (Book book : books) {
            System.out.println(book);
        }

        // Imprimir listado de películas disponibles
        System.out.println("\nListado de películas disponibles:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        // Registrar venta de un libro y una película
        float totalVentas = book1.getPrice() + movie1.getPrice();
        System.out.println("\nTotal de ventas realizadas: $" + totalVentas);
    }
}

