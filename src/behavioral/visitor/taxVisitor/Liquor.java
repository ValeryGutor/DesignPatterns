package behavioral.visitor.taxVisitor;

class Liquor implements Visitable {

    private float price;

    Liquor(float item) {
        price = item;
    }

    public float accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public float getPrice() {
        return price;
    }

}