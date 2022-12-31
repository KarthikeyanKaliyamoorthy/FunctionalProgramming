package edu.functional.programming.design.pattern.builder;

public class Mobile {

    final int ram;
    final int storage;
    final int camera;
    final int battery;
    final String processor;
    final double screenSize;

    public Mobile(MobileBuilder mobileBuilder) {
        this.ram = mobileBuilder.ram;
        this.storage = mobileBuilder.storage;
        this.camera = mobileBuilder.camera;
        this.battery = mobileBuilder.battery;
        this.processor = mobileBuilder.processor;
        this.screenSize = mobileBuilder.screenSize;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public int getCamera() {
        return camera;
    }

    public int getBattery() {
        return battery;
    }

    public String getProcessor() {
        return processor;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "ram=" + ram +
                ", storage=" + storage +
                ", camera=" + camera +
                ", battery=" + battery +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
