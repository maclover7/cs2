/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningspeedforfivepeople;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author 18mossj
 */
public class RunningSpeedForFivePeople {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      // Data entry for Person 1
      System.out.println("Please enter the first person's height in terms of inches");
      int first_height = sc.nextInt();
      System.out.println("Please enter first person's weight in terms of pounds");
      int first_weight = sc.nextInt();
      System.out.println("Please enter first person's stride in terms of inches");
      int first_stride = sc.nextInt();
      System.out.println("Please enter first person's age in terms of years");
      int first_years = sc.nextInt();
      
      // Data entry for Person 2
      System.out.println("Please enter the second person's height in terms of inches");
      int second_height = sc.nextInt();
      System.out.println("Please enter second person's weight in terms of pounds");
      int second_weight = sc.nextInt();
      System.out.println("Please enter second person's stride in terms of inches");
      int second_stride = sc.nextInt();
      System.out.println("Please enter second person's age in terms of years");
      int second_years = sc.nextInt();
      
      // Data entry for Person 3
      System.out.println("Please enter the third person's height in terms of inches");
      int third_height = sc.nextInt();
      System.out.println("Please enter third person's weight in terms of pounds");
      int third_weight = sc.nextInt();
      System.out.println("Please enter third person's stride in terms of inches");
      int third_stride = sc.nextInt();
      System.out.println("Please enter third person's age in terms of years");
      int third_years = sc.nextInt();
      
      // Data entry for Person 4
      System.out.println("Please enter the fourth person's height in terms of inches");
      int fourth_height = sc.nextInt();
      System.out.println("Please enter fourth person's weight in terms of pounds");
      int fourth_weight = sc.nextInt();
      System.out.println("Please enter fourth person's stride in terms of inches");
      int fourth_stride = sc.nextInt();
      System.out.println("Please enter fourth person's age in terms of years");
      int fourth_years = sc.nextInt();
      
      // Data entry for Person 5
      System.out.println("Please enter the fifth person's height in terms of inches");
      int fifth_height = sc.nextInt();
      System.out.println("Please enter fifth person's weight in terms of pounds");
      int fifth_weight = sc.nextInt();
      System.out.println("Please enter fifth person's stride in terms of inches");
      int fifth_stride = sc.nextInt();
      System.out.println("Please enter fifth person's age in terms of years");
      int fifth_years = sc.nextInt();
      
      // Calculate and print out the running speed
      int[] running_speeds = new int[6];
      running_speeds[0] = calcRunSpeed(first_height, first_weight, first_stride, first_years);
      running_speeds[1] = calcRunSpeed(second_height, second_weight, second_stride, second_years);
      running_speeds[2] = calcRunSpeed(third_height, third_weight, third_stride, third_years);
      running_speeds[3] = calcRunSpeed(fourth_height, fourth_weight, fourth_stride, fourth_years);
      running_speeds[4] = calcRunSpeed(fifth_height, fifth_weight, fifth_stride, fifth_years);
      
      // Sort
      Arrays.sort(running_speeds);
      
      // Print!
      System.out.println("First speed is " + running_speeds[0]);
      System.out.println("Second speed is " + running_speeds[1]);
      System.out.println("Third speed is " + running_speeds[2]);
      System.out.println("Fourth speed is " + running_speeds[3]);
      System.out.println("Fifth speed is " + running_speeds[4]);
      
      // Winning logic
      boolean first_win = winRace(running_speeds[0]);
      boolean second_win = winRace(running_speeds[1]);
      boolean third_win = winRace(running_speeds[2]);
      boolean fourth_win = winRace(running_speeds[3]);
      boolean fifth_win = winRace(running_speeds[4]);
      
      if (first_win == true) {
        System.out.println("The person with the running speed of " + running_speeds[0] + " won!");
      } else if (second_win == true) {
        System.out.println("The person with the running speed of " + running_speeds[1] + " won!");
      } else if (third_win == true) {
        System.out.println("The person with the running speed of " + running_speeds[2] + " won!");
      } else if (fourth_win == true) {
        System.out.println("The person with the running speed of " + running_speeds[3] + " won!");
      } else if (fifth_win == true) {
        System.out.println("The person with the running speed of " + running_speeds[4] + " won!");
      }
    }
    
    public static int calcRunSpeed(int height, int weight, int stride, int age) {
      int running_speed = ((height + weight / stride) + age) / 5;
      return running_speed;
    }
    
    public static boolean winRace(int runSpeed) {
      double random = Math.random();
      if (random % 2 == 0) {
        return true;
      } else {
        return false;
      }
    }
}
