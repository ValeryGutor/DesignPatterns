package behavioral.mediator.example_machine;

public interface MachineMediator {

    void start();

    void wash();

    void open();

    void closed();

    void on();

    void off();

    boolean checkTemperature(int temp);

}
