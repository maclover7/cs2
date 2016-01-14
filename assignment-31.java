package storeproject;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author 18mossj
 */
public class Storeproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter the store information:");
      System.out.println("Please enter the store name:");
      String store_name = sc.nextLine();
      System.out.println("Please enter the store owner:");
      String store_owner = sc.nextLine();
      System.out.println("Please enter the store phone number:");
      String store_phone_number = sc.nextLine();
      Item[] store_items = new Item[0];
      Store store = new Store(store_name, store_items, store_owner, store_phone_number);
      
//      while(command != "exit"){
        System.out.println("Which task would you like to complete?");
        System.out.println("Enter add_item to add an item");
        System.out.println("Enter search_item to search for an item");
        System.out.println("Enter buy_item to buy an item");
        System.out.println("Enter rm_item to remove an item");
        
        dispatchCommand(sc, store);
//      }
    }
    
    public static void dispatchCommand(Scanner sc, Store store){
      String command = sc.next();
      
      if (command.equals("add_item")) {
        addItem(sc, store);
      } else if (command == "search_item") {
        Item[] items = searchItem(sc, store);
        
        if (items.length == 0) {
          System.out.println("There are no return values.");
        } else {
          for (int i = 0; i < items.length; i++){
            System.out.println("For return value #" + i + ":");
            System.out.println("The description is " + items[i].getDescription());
            System.out.println("The buyer price is " + items[i].getBuyerPrice());
            System.out.println("The sales price is " + items[i].getSalesPrice());
          }
        }
        
      } else if (command.equals("buy_item")) {
        Item[] search_items = searchItem(sc, store);
        Item[] store_items = store.getItems();
        
        if (search_items.length == 0) {
          System.out.println("There are no items available for purchase.");
        } else {
          System.out.println("How many would you like to buy?");
          int purchase_count = sc.nextInt();
          
          if (purchase_count > search_items.length) {
            System.out.println("You cannot buy more than are in stock.");
          } else {
            ArrayList<Item> store_item_list = new ArrayList<Item>();
            
            for (int i = 0; i < store_items.length; i++){
              store_item_list.add(store_items[i]);
            }
            
            for (int i = 0; i < search_items.length; i++) {
              store_item_list.remove(search_items[i]);
            }
            
            Item[] updated_items = (Item[]) store_item_list.toArray();
            store.setItems(updated_items);
            
            System.out.println("You have bought " + purchase_count + "items.");
          }
        }
      } else if (command.equals("rm_item")) {
        Item[] search_items = searchItem(sc, store);
        Item[] store_items = store.getItems();
        
        if (search_items.length == 0) {
          System.out.println("There are no items available for removal.");
        } else {
          System.out.println("How many would you like to remove?");
          int remove_count = sc.nextInt();
          
          if (remove_count > search_items.length) {
            System.out.println("You cannot remove more than are in stock.");
          } else {
            ArrayList<Item> store_item_list = new ArrayList<Item>();
            
            for (int i = 0; i < store_items.length; i++){
              store_item_list.add(store_items[i]);
            }
            
            for (int i = 0; i < search_items.length; i++) {
              store_item_list.remove(search_items[i]);
            }
            
            Item[] updated_items = (Item[]) store_item_list.toArray();
            store.setItems(updated_items);
            
            System.out.println("You have removed " + remove_count + "items.");
          }
        }
      } else if (command.equal("exit")) {
        System.exit(0);
      }
    }
    
    public static void addItem(Scanner sc, Store store) {
      System.out.println("Enter the description for the item:");
      String item_description = sc.nextLine();
      System.out.println("Enter the buyer price for the item:");
      double item_buyer_price = sc.nextDouble();
      System.out.println("Enter the sales price for the item:");
      double item_sales_price = sc.nextDouble();
      Item[] new_items = store.getItems();
      new_items[new_items.length + 1] = new Item(item_description, item_buyer_price, item_sales_price);
      store.setItems(new_items);
      System.out.println("Item added!");
    }
    
    public static Item[] searchItem(Scanner sc, Store store) {
      System.out.println("What would you like to search for the item by?");
      System.out.println("Enter desc for description");
      System.out.println("Enter bp for buyer_price");
      System.out.println("Enter sp for sales_price");
      String search_by = sc.next();
      System.out.println("What would you like the value to equal?");
      String search_value = sc.nextLine();
      // Convert String to Double for later use
      double double_search_value = Double.parseDouble(search_value);
      
      Item[] return_values = new Item[0];
      Item[] store_items = store.getItems();
      
      if (search_by == "desc") {
        for (int i = 0; i < store_items.length; i++){
          if (store_items[i].getDescription() == search_value) {
            return_values[return_values.length + 1] = store_items[i];
          }
        }
      } else if (search_by == "bp") {
        for (int i = 0; i < store_items.length; i++){
          if (store_items[i].getBuyerPrice() == double_search_value) {
            return_values[return_values.length + 1] = store_items[i];
          }
        }
      } else if (search_by == "sp") {
        for (int i = 0; i < store_items.length; i++){
          if (store_items[i].getSalesPrice() == double_search_value) {
            return_values[return_values.length + 1] = store_items[i];
          }
        }
      }
      
      return return_values;
    }
}

public class Item {
  private String description;
  private double buyer_price;
  private double sales_price;
  
  public Item(String description, double buyer_price, double sales_price) {
    description = description;
    buyer_price = buyer_price;
    sales_price = sales_price;
  }
  
  public double getBuyerPrice() {
    return buyer_price;
  }
  
  public String getDescription() {
    return description;
  }
  
  public double getSalesPrice() {
    return sales_price;
  }
}

public class Store {
  private String location;
  private Item[] items;
  private String owner;
  private String phone_number;
  
  public Store() {
    location = "NYC";
    items = new Item [3];
    owner = "Jon";
    phone_number = "123-456-7890";
  }
  
  public Store(String location, Item[] items, String owner, String phone_number) {
    location = location;
    items = items;
    owner = owner;
    phone_number = phone_number;
  }
  
  // get
  public Item[] getItems() {
    return items;
  }
  
  public String getLocation() {
    return location;
  }
  
  public String getOwner() {
    return owner;
  }
  
  public String getPhoneNumber() {
    return phone_number;
  }
  
  // set
  public void setItems(Item[] items) {
    items = items;
  }
  
  public void setLocation(String location) {
    location = location;
  }
  
  public void setOwner(String owner) {
    owner = owner;
  }
  
  public void setPhoneNumber(String phone_number) {
    phone_number = phone_number;
  }
}