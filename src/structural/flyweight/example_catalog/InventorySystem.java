package structural.flyweight.example_catalog;

import java.util.ArrayList;
import java.util.List;

public class InventorySystem {

    private final Catalog catalog = new Catalog();
    private final List<Item> orders = new ArrayList<>();

    public void takeOrder(String itemName) {
        Item item = catalog.lookup(itemName);
        System.out.println("Total items which was made: " + catalog.totalItemMade());
        orders.add(item);
    }

    public void showOrders() {
        for (Item item: orders) {
            System.out.println(item);
        }
    }
}
