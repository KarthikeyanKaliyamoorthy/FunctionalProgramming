package edu.functional.programming.design.pattern.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        MobileBuilder builder = new MobileBuilder();
        Mobile myMobile = builder.with(myBuilder -> {
            myBuilder.camera = 3;
            myBuilder.battery = 1;
            myBuilder.processor = "A16 BIONIC";
        }).createMobile();
        System.out.println(myMobile);
    }
}
