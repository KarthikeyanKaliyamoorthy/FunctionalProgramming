package edu.functional.programming.higher.order.functions;

public class HigherOrderFunctions {

    public static void main(String[] args) {

        IFactory<Integer> factory = createFactory(() -> Math.random() * 100, r -> r.intValue());
        Integer endProduct = factory.create();
        System.out.println(endProduct);
    }

    public static <T,R> IFactory<R> createFactory(IProducer<T> producer, IConfigurator<T,R> configurator) {
        return () ->{
            T product = producer.produce();
            return configurator.configure(product);
        };
    }

}
