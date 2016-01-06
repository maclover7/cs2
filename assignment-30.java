/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeproject;

/**
 *
 * @author 18mossj
 */
public class Storeproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Item[] items = new Item[3];
      Store s = new Store("NYC", items, "Jon", "123-456-7890");
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
  public static void setItems(Item[] items) {
    items = items;
  }
  
  public static void setLocation(String location) {
    location = location;
  }
  
  public static void setOwner(String owner) {
    owner = owner;
  }
  
  public static void setPhoneNumber(String phone_number) {
    phone_number = phone_number;
  }
}
