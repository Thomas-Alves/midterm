package midterm;
/** @author Thomas Alves
**/
import java.util.Scanner;

/**
 * Simulator to add items, print inventory and to search item's quantity.
 *
 * @author Ali Hassan
 * @author Paul Bonenfant
 */
public class InventorySystem {

    public static void main(String[] args) {
        
        Item item1 = new Item(0, 0, null);//No ID, quantity or name assigned.

        /**
         * Add a new item to the inventory. Program asks the user to enter name
         * and quantity of the item. For new item's ID, program simply
         * increments the ID of the last item added.
         */
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter name of the item to add:");
        String name = input.nextLine();
        
        System.out.println("Enter the quantity:");
        int quantity = input.nextInt();
        
        Item item2 = new Item(++item1.itemID, quantity, name);
        item1.addItem(item2);

        /**
         * Add two more items.
         */
        Item item3 = new Item(++item1.itemID, 5, "ET-2750 printer");
        item1.addItem(item3);

        Item item4 = new Item(++item1.itemID, 10, "MX-34 laptops");
        item1.addItem(item4);

        /**
         * Print the inventory.
         */

        item1.printInventory();

        /**
         * Find quantity of a particular item in the inventory.
         */

        System.out.println("Enter ID of the item whose quantity you want to find:");
        int temp_ID = input.nextInt();
        System.out.println("Item's quantity is: " + item1.getItemQuantity(temp_ID));

    }


}
