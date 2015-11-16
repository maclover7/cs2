/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice.work;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author 18mossj
 */
public class DiceWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Input number of times to roll the dice
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter the number of times to roll the dice:");
      int dice_roll_count = sc.nextInt();
      
      // Loop helpers
      int[] counters = new int[13];
      Random rand = new Random();
      
      for(int i=0; i < dice_roll_count; i++) {
        // Generate two numbers between 1 and 6, and then add them
        int first = rand.nextInt(6) + 1;
        int second = rand.nextInt(6) + 1;
        int result = first + second;
        counters[result]++;
      }
      
      // Output results
      System.out.println("The results are...");
      for(int i=0; i < counters.length; i++) {
        System.out.println(i + " was rolled was " + counters[i] + " times.");
      }
    }
}
