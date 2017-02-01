package structural.bridge.example_Color;

public class ColorDemo {

    public static void main(String[] args) {

        Color redColor = new RedColor();

        Shape redCircle = new Circle(redColor);

        System.out.println(redCircle);

        Color yellowColor = new YellowColor();

        Shape yellowSquare = new Square(yellowColor);

        System.out.println(yellowSquare);
    }
}
