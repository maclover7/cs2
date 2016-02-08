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
      
      do {
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
      
        System.out.println("Please enter customer payment:");
        double payment = sc.nextDouble();
      
        double change = payment - total_due;
        System.out.println("Customer Change: " + change);
        
        System.out.println("Another customer? (true/false)");
        cont = sc.nextBoolean();
      } while (cont == true);
    }
}
