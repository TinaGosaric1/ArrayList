import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
    }

    public void removeGroceryItem(int position) {
        String myItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(myItem + " is removed from the list.");
    }

    public String findItem(String searchItem){
        int position = groceryList.indexOf(searchItem);
        if(position >= 0){
            return groceryList.get(position);
        }
        return null;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");

        int counter = 1;
        for (String item : groceryList) {
            System.out.print(counter + ": " + item + "\n");
            counter++;
        }
    }
}
