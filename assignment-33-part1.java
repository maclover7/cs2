/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Fastfood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      boolean cont = true;
      int total_dollars = 0;
      int total_customers = 0;
      
      do {
        total_customers += 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many hamburgers?");
        String hamburger_input = sc.next();
        int hamburger_count = hamburger_input.charAt(0);
      
        System.out.println("How many cheeseburgers?");
        String cheeseburger_input = sc.next();
        int cheeseburger_count = cheeseburger_input.charAt(0);
      
        double total = (hamburger_count * 1.19) + (cheeseburger_count * 1.39);
        System.out.println("Total: " + total);
        double tax = total * 0.05;
        System.out.println("Sales tax: " + tax);
        double total_due = total + tax;
        System.out.println("Total due: " + total_due);
        total_dollars += total_due;
      
        System.out.println("Please enter customer payment:");
        double payment = sc.nextDouble();
      
        double change = payment - total_due;
        System.out.println("Customer Change: " + change);
        
        System.out.println("Another customer? (true/false)");
        cont = sc.nextBoolean();
      } while (cont == true);
      
      if (cont == false) {
        System.out.println("The total customer count is " + total_customers);
        System.out.println("The total due is " + total_dollars);
        
        int avg_payment;
        avg_payment = (total_dollars / total_customers);
        
        System.out.println("The average payment per customer is " + avg_payment);
      }
    }
}
