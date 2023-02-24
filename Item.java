package midterm;

/**
 * A class to model items stored in the inventory of a Warehouse. For simplicity, let's assume each item in the
 * inventory has a name, quantity and a unique ID. The system allows to add new items, find quantity by item's ID and
 * print full inventory. Use this code to answer Q#16 and Q#17 of Part B.
 *
 * @author Ali Hassan
 */
public class Item {



    private static Item[] inventory = new Item[100];
    private int itemCounter = 0; // counts numbers of items in the inventory.

    /**
     * Constructor takes in item's ID, quantity and it's name.
     *
     * @param itemID Unique ID of the item.
     * @param quantity the quantity of the item.
     * @param name the name of the item.
     */
    public Item(int itemID, int quantity, String name) {
        this.setItemID(itemID);
        this.setQuantity(quantity);
        this.setName(name);
    }

    /**
     * An array to hold up to 100 items.
     */
    public static midterm.Item[] getInventory() {
        return inventory;
    }

    public static void setInventory(midterm.Item[] inventory) {
        Item.inventory = inventory;
    }

    /**
     * A method to add new item into the inventory.
     *
     * @param newItem the item object to be added into the inventory.
     */
    public void addItem(Item newItem) {
        getInventory()[getItemCounter()] = newItem;
        setItemCounter(getItemCounter() + 1);
        setQuantity(getQuantity() + 1);
    }

    /**
     * A method to print full inventory i.e. item's ID, name and it's quantity.
     */
    public void printInventory() {
        for (int i = 0; i < getItemCounter(); i++) {
            System.out.println("ID: " + getInventory()[i].getItemID()
                    + "\t Name: " + getInventory()[i].getName()
                    + "\t Quantity:" + getInventory()[i].getQuantity());
        }
    }

    /**
     * A method to get quantity of a specific item in the inventory.
     *
     * @param ID the ID of the item to be searched
     * @return the quantity of the item.
     */
    public int getItemQuantity(int ID) {
        int temp = 0;
        for (int j = 0; j < getItemCounter(); j++) {
            if (getInventory()[j].getItemID() == ID) {
                temp = getInventory()[j].getQuantity();
                break;
            }
        }
        return temp;
    }

    public int getItemCounter() {
        return itemCounter;
    }

    public void setItemCounter(int itemCounter) {
        this.itemCounter = itemCounter;
    }

}
