package behavioral.visitor.withVisitor;

public class AtvPartDisplayingVisitor implements AtvPartVisitor {

    @Override
    public void visit(Fender fender) {
        System.out.println("This is a fender");
    }

    @Override
    public void visit(Oil oil) {
        System.out.println("This is an oil");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("This is a wheel");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("We have an order");
    }
}
