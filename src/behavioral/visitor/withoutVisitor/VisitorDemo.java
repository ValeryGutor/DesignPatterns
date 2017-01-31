package behavioral.visitor.withoutVisitor;

public class VisitorDemo {

    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Fender());
        order.addPart(new Oil());
        order.addPart(new Wheel());

//        double price = order.getShipping();
    }

}
