/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleanproducts;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Cleanproducts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      String[] splitted = input.split("\\s+");
      
      String position = "";
      
      if (splitted[0] == "S") {
        position = "supervisor";
      } else if (splitted[0] == "R") {
        position = "respresentative";
      }
      
      int wax_units = Integer.parseInt(splitted[1]);
      int soap_units = Integer.parseInt(splitted[2]);
      int window_cleaner_units = Integer.parseInt(splitted[3]);
      
      double commission = 0;
      int bonus = 0;
      double wax = 13.95;
      double soap = 17.95;
      double window_cleaner = 29.95;
      
      System.out.println("You sold " + wax_units + " units of wax.");
      System.out.println("You sold " + soap_units + " units of soap.");
      System.out.println("You sold " + window_cleaner_units + " units of window cleaner.");
      System.out.println("You sold a total of " + (wax_units + soap_units + window_cleaner_units) + " units");
      
      if (position == "representative") {
        commission = 0.07 * (wax_units * wax + soap_units * soap + window_cleaner_units * window_cleaner);
        if (commission > 300.00) {
          bonus = 100;
        }
      } else if (position == "supervisor") {
        commission = 0.05 * (wax_units * wax + soap_units * soap + window_cleaner_units * window_cleaner);
        if (commission > 200.00) {
          bonus = 100;
        }
      }
      
      System.out.println("The commission equals " + commission);
      System.out.println("The bonus equals " + bonus);
      System.out.println("The gross pay equals " + (commission + bonus));
    }
}
