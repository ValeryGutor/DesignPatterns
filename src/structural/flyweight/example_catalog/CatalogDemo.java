package structural.flyweight.example_catalog;

public class CatalogDemo {

    public static void main(String[] args) {

        InventorySystem inventorySystem = new InventorySystem();
        inventorySystem.takeOrder("Telephone HTC");
        inventorySystem.takeOrder("Telephone Samsung");
        inventorySystem.takeOrder("Telephone HTC");
        inventorySystem.takeOrder("Telephone Motorola");
        inventorySystem.takeOrder("TV Samsung");
        inventorySystem.takeOrder("TV Samsung");

    }

}
