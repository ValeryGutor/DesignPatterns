package behavioral.visitor.withVisitor;

public class VisitorDemo {
    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Fender());
        order.addPart(new Oil());
        order.addPart(new Wheel());

        order.accept(new AtvPartShippingVisitor());
//         let's use another visitor:
//        order.accept(new AtvPartDisplayingVisitor());
    }
}
