package edu.functional.programming.design.pattern.command;

public class AcRemote {
    Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void buttonPressed(){
        command.execute();
    }
}
