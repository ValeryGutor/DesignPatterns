package behavioral.mediator.example_machine;

public class TestMediator {

    public static void main(String[] args) {
        MachineMediator mediator = null;
        Sensor sensor = new Sensor();
        Machine machine = new Machine();
        Heater heater = new Heater();
        Valve valve = new Valve();
        Button button = new Button();

        mediator = new CottonMediator(machine, heater, sensor, valve);

        button.setMediator(mediator);
        machine.setMediator(mediator);
        heater.setMediator(mediator);
        valve.setMediator(mediator);

        button.press();
    }

}
