package edu.functional.programming.reference;

import java.util.function.Function;

public class ConstructorReference
{
    public static void main(String[] args) {
        Function<Runnable, Thread> threadGenerator = Thread :: new;
        Runnable task1 = () -> System.out.println("Task 1 Executed");
        Runnable task2 = () -> System.out.println("Task 2 Executed");

        Thread t1 = threadGenerator.apply(task1);
        Thread t2 = threadGenerator.apply(task2);

        t1.start();
        t2.start();

        threadGenerator
                .apply(() -> System.out.println("Task 3 Executed"))
                .start();
    }
}
