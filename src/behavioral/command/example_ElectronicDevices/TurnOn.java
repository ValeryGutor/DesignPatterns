package behavioral.command.example_ElectronicDevices;

// concrete command;
public class TurnOn implements Command {

    private ElectronicDevice electronicDevice;

    public TurnOn(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.on();
    }
}
