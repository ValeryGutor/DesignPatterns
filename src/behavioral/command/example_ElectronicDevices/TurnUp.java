package behavioral.command.example_ElectronicDevices;

// concrete command;
public class TurnUp implements Command {

    private ElectronicDevice electronicDevice;

    public TurnUp(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.volumeUp();
    }
}
