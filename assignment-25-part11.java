/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic11;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Arithmetic11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter your gross salary:");
      double salary = sc.nextDouble();
      System.out.println("Please enter your # of dependents:");
      int dependents = sc.nextInt();
      // Calculate taxes
        double taxes = 0;
        // flat rate of 20%
        taxes += (salary * 0.20);
        // flat tax of 1000
        taxes += 1000;
        // $2,000 per dependent
        taxes += (dependents * 2000);
      System.out.println("Your taxes would be equal to " + taxes + ".");
    }
}
