package edu.functional.programming.optionals;

import java.util.Optional;

public class OptionalCreation {
    public static void main(String[] args) {
        String value = "A value";
        String nullStr = null;
        Optional<String> optional = Optional.of(value);
        System.out.println(optional.get());
        //empty
        Optional<Integer> empty = Optional.empty();
        //System.out.println(empty.get());
        //nullable
        Optional<String> nullable = Optional.ofNullable(value);
        System.out.println(nullable);
        Optional<String> emptyOptional = Optional.ofNullable(nullStr);
        System.out.println(emptyOptional);

        //isPresent
        String s = emptyOptional.isPresent() ? emptyOptional.get() : "empty";
        System.out.println(s);

        //orElse, orElseGet
        String orElse = emptyOptional.orElse("Nothing");
        System.out.println(orElse);

        String orElseGet = emptyOptional.orElseGet(() -> "Empty Supplier");
        System.out.println(orElseGet);

        //orElseThrow

        String orElseThrow = emptyOptional.orElseThrow(() -> new IllegalArgumentException());

    }
}
