package behavioral.mediator.example_machine;

public class Sensor {

    public boolean checkTemperature(int temp) {
        System.out.println("Temperature reached " + temp + " *C");
        return true;
    }

}
