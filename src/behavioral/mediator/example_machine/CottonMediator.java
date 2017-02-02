package behavioral.mediator.example_machine;

public class CottonMediator implements MachineMediator {

    private final Machine machine;
    private final Heater heater;
    private final Sensor sensor;
    private final Valve valve;

    public CottonMediator(Machine machine, Heater heater, Sensor sensor, Valve valve) {
        this.machine = machine;
        this.heater = heater;
        this.sensor = sensor;
        this.valve = valve;

        System.out.println(".........................Setting up for COTTON program.........................");
    }

    @Override
    public void start() {
        machine.start();
    }

    @Override
    public void wash() {
        System.out.println("Start motor");
        System.out.println("Start rotation");
        System.out.println("Adding detergent"); // detergent - миючий засіб
    }

    @Override
    public void open() {
        valve.open();
    }

    @Override
    public void closed() {
        valve.closed();
    }

    @Override
    public void on() {
        heater.on(40);
    }

    @Override
    public void off() {
        heater.off();
    }

    @Override
    public boolean checkTemperature(int temp) {
        return sensor.checkTemperature(temp);
    }

}
