package behavioral.command.example_ElectronicDevices;

// invoker
public class ButtonOn {

    private Command command;

    public ButtonOn(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}
