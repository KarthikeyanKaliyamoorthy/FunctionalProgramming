package edu.functional.programming.functional.intrfce;
@FunctionalInterface
public interface FunctionalGenerics<T,R> {
    R execute(T t);
}
