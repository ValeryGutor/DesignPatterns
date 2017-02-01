package structural.bridge.example_Color;

public class BlueColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("Applying Blue color");
    }

    public String toString() {
        return "blue;";
    }
}
