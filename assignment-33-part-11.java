/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesser;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 18mossj
 */
public class Guesser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
      Scanner sc = new Scanner(System.in);
      int random = generateInt();
      int attempts = 0;
      while(true) {
        System.out.println("Enter your guess:");
        int guess = sc.nextInt();
        if (guess < random) {
          System.out.println("Wrong, the number you guessed is lower than the number");
          attempts++;
        } else if (guess > random) {
          System.out.println("Wrong, the number you guessed is higher than the number");
          attempts++;
        } else if (guess == random) {
          System.out.println("You guessed correctly in " + attempts + " attempts!");
          break;
        }
      }
    }
    
    public static int generateInt() {
      Random randomizer = new Random();
      return randomizer.nextInt((100 - 0) + 1) + 0;
    }
    
}
