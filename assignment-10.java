/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package running.speed.capacity;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class RunningSpeedCapacity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
      Scanner sc = new Scanner(System.in);
      
      // Data entry
      System.out.println("Please enter your height in terms of inches");
      int height = sc.nextInt();
      System.out.println("Please enter your weight in terms of pounds");
      int weight = sc.nextInt();
      System.out.println("Please enter your stride in terms of inches");
      int stride = sc.nextInt();
      System.out.println("Please enter your age in terms of years");
      int years = sc.nextInt();
      
      // Calculate and print out the running speed
      int running_speed = calcRunSpeed(height, weight, stride, years);
      System.out.println("Your running speed would be " + running_speed + ".");
    }
    
    public static int calcRunSpeed(int height, int weight, int stride, int age) {
      int running_speed = ((height + weight / stride) + age) / 5;
      return running_speed;
    }
}
