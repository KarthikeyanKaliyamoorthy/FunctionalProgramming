package edu.functional.programming.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ObservingStream {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<Book> popularHorrorBooks = new ArrayList<>();

        List<Book> famousHorrorBooks = books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                .filter(book -> book.getRating() > 3)
                .collect(Collectors.toList());

        //1.Data source
        Stream<Book> bookStream = books.stream();

        //2.Intermediate Operation
        Stream<Book> horrorBooks = bookStream.filter(book -> book.getGenre().equalsIgnoreCase("Horror"));
        
        //3.Intermediate Operation
        Stream<Book> famHorrorBooks = horrorBooks.filter(book -> book.getRating() > 3);
        
        //4.Terminal Operation
        List<Book> collect = famHorrorBooks.collect(Collectors.toList());


    }
}
