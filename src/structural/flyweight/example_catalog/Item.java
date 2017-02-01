package structural.flyweight.example_catalog;

// Instance of flyweight (this is an instance which we will create hundred times)
public class Item { // immutable

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
