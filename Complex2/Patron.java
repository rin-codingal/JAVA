package Complex2;

import java.util.ArrayList;
import java.util.List;

class Patron {
    private String name;
    private int id;
    private List<Item> checkedOutItems;

    public Patron(String name, int id) {
        this.name = name;
        this.id = id;
        this.checkedOutItems = new ArrayList<>();
    }

    // Check out an item if under limit (max 10)
    public void checkOutItem(Item item) {
        if (checkedOutItems.size() < 10) {
            checkedOutItems.add(item);
        }
    }

    // Return an item
    public void returnItem(Item item) {
        checkedOutItems.remove(item);
    }

    // Get number of checked-out items
    public int getNumItemsCheckedOut() {
        return checkedOutItems.size();
    }

    // Getters
    public String getName() { return name; }
    public int getId() { return id; }
    public List<Item> getCheckedOutItems() { return checkedOutItems; }
}
