package edu.functional.programming.optionals;

import java.util.Optional;

public class Operation {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Value");

        //map()
        String orElse = optional.map(val -> "Replaced").orElse("Empty");
        System.out.println(orElse);

        //filter
        Optional<String> filter = optional.filter(val -> val.equals("Value"));
        System.out.println(filter.get());

        //flatMap
        Optional<String> flatMap = optional.flatMap(val -> Optional.of("Replaced"));
        System.out.println(flatMap.get());
    }
}
