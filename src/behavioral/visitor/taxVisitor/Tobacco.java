package behavioral.visitor.taxVisitor;

class Tobacco implements Visitable {

    private float price;

    Tobacco(float item) {
        price = item;
    }

    public float accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public float getPrice() {
        return price;
    }

}
