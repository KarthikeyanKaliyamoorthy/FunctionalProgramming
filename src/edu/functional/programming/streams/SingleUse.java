package edu.functional.programming.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SingleUse {
    public static void main(String[] args) {

        Stream<Book> stream = BooksRepository.getBooks().stream();

        List<Book> famousHorrorBooks = stream
                .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                .filter(book -> book.getRating() > 3)
                .collect(Collectors.toList());

        famousHorrorBooks.forEach(System.out::println);

        List<Book> famousRomanticBooks = stream
                .filter(book -> book.getGenre().equalsIgnoreCase("Romance"))
                .filter(book -> book.getRating() > 3)
                .collect(Collectors.toList());

        famousRomanticBooks.forEach(System.out::println);


    }
}
