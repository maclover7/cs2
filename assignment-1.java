/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package using.math;
  import java.util.Random;
  import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class UsingMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generate random number from 1 to 10
        Random rand = new Random();
        int random_number = rand.nextInt(10)+1;
        System.out.println(random_number);
        
        // Ask for number to be input
        System.out.println("Please type in a number.");
        Scanner scanner = new Scanner(System.in);
        int scanned_number = scanner.nextInt();
        
        // Multiply the numbers and output their product
        int multiplied_number = random_number * scanned_number;
        System.out.println("The product of the random number " + random_number + " and your own number " + scanned_number + ", is " + multiplied_number + "!");
    }
    
}
