package edu.functional.programming.design.pattern.iterator;

import java.util.function.Consumer;

public class MyArrayList {
    Object [] elements = new Object[5];

    MyArrayList(Object [] elements){
        this.elements= elements;
    }

    public void forEach(Consumer<Object> action) {
        for (int i=0; i< elements.length; i++){
            action.accept(elements[i]);
        }
    }
}
