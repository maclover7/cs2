/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasnclean;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Gasnclean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of Gallons of Gas:");
      double gallons = sc.nextDouble();
      System.out.println("Enter the Type of Gas (or N for NONE):");
      String gas = sc.next();
      System.out.println("Enter Y to obtain a wash or N for no wash:");
      
      double total_gas = 0;
      
      if (gas == "R") {
        total_gas += gallons * 1.149;
      }
      else if (gas == "P") {
        total_gas += gallons * 1.199;
      }
      else if (gas == "S") {
        total_gas += gallons * 1.289;
      }
      else if (gas == "N") {
        total_gas = 0;
      }
      
      double car_wash = 0;
      
      if (total_gas >= 10.00) {
        car_wash += 1.25;
      } else {
        car_wash += 3.00;
      }
      
      System.out.println("The total price of gas is " + total_gas);
      System.out.println("The cost of the car wash is " + car_wash);
      System.out.println("The total amount due is " + (total_gas + car_wash));
    }
}
