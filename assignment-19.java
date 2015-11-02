/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartment.work;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class ApartmentWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // Create a building
      System.out.println("Please enter the name for the building:");
      String building_name = sc.next();
      System.out.println("Please enter the address for the building:");
      String building_address = sc.next();
      Building building = new Building(building_name, building_address);
      // Create an apartment
      System.out.println("Please enter the rent (as an integer) for your apartment:");
      int apartment_rent = sc.nextInt();
      System.out.println("Please enter the type for your apartment");
      String apartment_type = sc.next();
      System.out.println("Please enter the number of rooms (as an integer) for your apartment");
      int apartment_number_of_rooms = sc.nextInt();
      System.out.println("Please enter the number of occupants (as an integer) for your apartment:");
      int apartment_number_of_occupants = sc.nextInt();
      System.out.println("Please enter if the apartment has air conditioning (as a boolean -- true or false):");
      boolean apartment_aircon = sc.nextBoolean();
      Apartment apartment = building.newApartment(apartment_rent, apartment_type, apartment_number_of_rooms, apartment_number_of_occupants, apartment_aircon);
      // Return data
    }
}

public class Apartment {
  public int number_of_rooms;
  public int rent;
  public String type;
  public int number_of_occupants;
  public boolean aircon;
  
  public Apartment(int rent, String type, int number_of_rooms, int number_of_occupants, boolean aircon) {
    rent = rent;
    type = type;
    setNumberOfRooms(number_of_rooms);
    setNumberOfOccupants(number_of_occupants);
    aircon = aircon;
  }
  
  public void setNumberOfOccupants(int number_of_occupants){
    if (number_of_rooms > 1 || number_of_rooms < 10) {
      number_of_rooms = number_of_rooms;
    } else {
      throw new IllegalArgumentException("Number of occupants must be between one and ten.");
    }
  }
  
  public void setNumberOfRooms(int number_of_rooms){
    if (number_of_rooms > 1 || number_of_rooms < 5) {
      number_of_rooms = number_of_rooms;
    } else {
      throw new IllegalArgumentException("Number of rooms must be between one and five.");
    }
  }
}

public class Building {
  public String address;
  public Apartment[] apartments;
  public String name;
  
  public Building(String name, String address) {
    name = name;
    address = address;
    Apartment[] apartments = new Apartment[10];
  }
  
  public calcRent(){}
  
  public Apartment newApartment(int rent, String type, int number_of_rooms, int number_of_occupants, boolean aircon) {
    Apartment apartment = new Apartment(rent, type, number_of_rooms, number_of_occupants, aircon);
    int current_array_length = apartments.length;
    apartments[current_array_length + 1] = apartment;
    return apartment;
  }
}
