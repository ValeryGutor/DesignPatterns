package behavioral.command.example_ElectronicDevices;

// receiver;
public class Television implements ElectronicDevice {

    @Override
    public void on() {
        System.out.println("Television is turn on.");
    }

    @Override
    public void off() {
        System.out.println("Television is turn off.");
    }

    @Override
    public void volumeUp() {
        System.out.println("Television volume is turn up.");
    }

    @Override
    public void volumeDown() {

    }

}
