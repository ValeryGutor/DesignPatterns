package behavioral.command.example_ElectronicDevices;

// concrete command;
public class TurnOff implements Command {

    private ElectronicDevice electronicDevice;

    public TurnOff(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.off();
    }
}
