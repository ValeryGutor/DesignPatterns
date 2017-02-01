package structural.bridge.example_Color;

public class YellowColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("Applying Yellow color");
    }

    public String toString() {
        return "yellow";
    }
}
