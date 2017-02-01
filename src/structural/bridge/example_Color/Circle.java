package structural.bridge.example_Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor(Color color) {
        color.applyColor();
    }

    public String toString() {
        return "This is a " + color + " circle";
    }
}
