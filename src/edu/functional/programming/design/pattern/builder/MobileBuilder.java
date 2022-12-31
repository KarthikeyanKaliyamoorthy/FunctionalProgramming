package edu.functional.programming.design.pattern.builder;

import java.util.function.Consumer;

public class MobileBuilder {

    int ram;
    int storage;
    int camera;
    int battery;
    String processor;
    double screenSize;

    public MobileBuilder with(Consumer<MobileBuilder> buildFields) {
        buildFields.accept(this);
        return this;
    }

    public Mobile createMobile() {
        return new Mobile(this);
    }
}
