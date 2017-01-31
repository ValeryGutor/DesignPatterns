package behavioral.visitor.taxVisitor;

class Necessity implements Visitable {

    private float price;

    Necessity(float item) {
        price = item;
    }

    public float accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public float getPrice() {
        return price;
    }

}
