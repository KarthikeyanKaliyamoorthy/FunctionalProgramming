package edu.functional.programming.closure;

public class ClosureExample {
    public static void main(String[] args) {

        int id = 11;
        Task lambda = () -> {
            //id=12;
            System.out.println(id);
            System.out.println("Task completed");
        };
        printId(lambda);
    }

    private static void printId(Task lambda) {
        lambda.doTask();
    }
}
