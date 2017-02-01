package structural.bridge.example_Color;

public class RedColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("Applying Red color");
    }

    public String toString() {
        return "red";
    }
}
