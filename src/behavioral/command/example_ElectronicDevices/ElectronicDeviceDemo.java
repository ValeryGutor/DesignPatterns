package behavioral.command.example_ElectronicDevices;

public class ElectronicDeviceDemo {

    public static void main(String[] args) {

        ElectronicDevice electronicDevice = new Television();

        TurnOn turnOn = new TurnOn(electronicDevice);

        ButtonOn buttonOn = new ButtonOn(turnOn);

        buttonOn.press();

    }
}
