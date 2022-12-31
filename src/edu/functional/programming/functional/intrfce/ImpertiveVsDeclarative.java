package edu.functional.programming.functional.intrfce;

import java.util.stream.IntStream;

public class ImpertiveVsDeclarative {
    public static void main(String[] args) {
        //Imperative

        int sumOfEvens =0;
        for (int i=0; i<=100;i++){
            if (i%2 == 0)
                sumOfEvens = sumOfEvens+i;
        }
        System.out.println(sumOfEvens);

        //Declarative
        int declarativeSum = IntStream.rangeClosed(1, 100)
                .filter(i -> i % 2 == 0)
                .reduce((x, y) -> x + y)
                .getAsInt();

        System.out.println(declarativeSum);
    }
}
