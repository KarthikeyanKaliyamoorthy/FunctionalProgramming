package edu.functional.programming.composition;

public class CompositionExample {
    public static void main(String[] args) {
        Function<Square, Integer> f1 = i -> i.getArea();
        Function<Integer, Double> f2 = area -> Math.sqrt(area);

        Square square =new Square();
        square.setArea(100);

        Function<Square, Double> getSide = f2.compose(f1);
        Double side = getSide.apply(square);
        System.out.println(side);
    }
}
