package edu.functional.programming.streams.parallel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParallelStreams {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        long startTime, endTime, count;

        for (int i = 0; i < 100; i++) {
            list.add(new Employee("kuppu",10000));
            list.add(new Employee("Ram",2323));
            list.add(new Employee("Murugu",2000));
            list.add(new Employee("Indiran",800));
            list.add(new Employee("Shiva",5000));
        }
        startTime= System.currentTimeMillis();
        count = list.stream()
                .filter(emp -> emp.getSalary() > 1000)
                .count();
        System.out.println("Performing Sequentially "+ count);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with sequential operation: " + (endTime -startTime));

        startTime= System.currentTimeMillis();
        count = list.parallelStream()
                .filter(emp -> emp.getSalary() > 1000)
                .count();
        System.out.println("Performing Parallel "+ count);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with parallel operation: " + (endTime -startTime));

    }
}
