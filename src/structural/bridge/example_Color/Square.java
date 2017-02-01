package structural.bridge.example_Color;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor(Color color) {
        color.applyColor();
    }

    public String toString() {
        return "This is a " + color + " square";
    }
}
