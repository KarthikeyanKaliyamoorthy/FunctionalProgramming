package edu.functional.programming.streams.operations;

import edu.functional.programming.streams.Book;
import edu.functional.programming.streams.BooksRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Laziness {
    public static void main(String[] args) {

        Stream<Book> bookStream = BooksRepository.getBooks().stream()
                .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                .peek(book -> System.out.println("Filtered book "+book))
                .filter(book -> book.getRating()>3);

        System.out.println("Filtering done!!");
        collect(bookStream);
    }

    private static void collect(Stream<Book> bookStream) {
        List<Book> popularHorrorBooks = bookStream.collect(Collectors.toList());
        System.out.println("Collection done!!");
        popularHorrorBooks.forEach(System.out::println);
    }

    public static class MapOperation {
        public static void main(String[] args) {
            Stream.of(1, 343, 5454, 445, 5454, 4525, 56, 38, 65, 12, 545)
                    .map(e -> e * 25)
                    .forEach(System.out::println);

            List<Book> books = new ArrayList<>();
            books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
            books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
            books.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67));
            books.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));

            Stream<Book> stream = books.stream();

            stream.filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                    .filter(book -> book.getRating() > 3)
                    .map(book -> book.getName())
                    .forEach(System.out::println);


        }
    }
}
