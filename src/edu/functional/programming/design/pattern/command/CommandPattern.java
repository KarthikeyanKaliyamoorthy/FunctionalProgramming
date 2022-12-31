package edu.functional.programming.design.pattern.command;

public class CommandPattern {
    public static void main(String[] args) {
        AC ac1 = new AC();
        AC ac2 = new AC();

        AcRemote acRemote = new AcRemote();
        acRemote.setCommand(ac2::turnOn);
        acRemote.buttonPressed();
    }
}
