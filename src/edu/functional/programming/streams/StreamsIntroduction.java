package edu.functional.programming.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsIntroduction {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<Book> popularHorrorBooks = new ArrayList<>();
        //before java 8
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase("Horror") && book.getRating() > 3)
                popularHorrorBooks.add(book);
        }
        //In java 8

        List<Book> famousHorrorBooks = books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                .filter(book -> book.getRating() > 3)
                .collect(Collectors.toList());
    }
}
