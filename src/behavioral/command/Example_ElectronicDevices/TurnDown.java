package behavioral.command.Example_ElectronicDevices;

public class TurnDown implements Command {

    private ElectronicDevice electronicDevice;

    public TurnDown(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.volumeDown();
    }
}
