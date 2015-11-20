/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic6;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Arithmetic6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter your stride in feet:");
      double stride = sc.nextDouble();
      System.out.println("Please enter your average stride per minute:");
      double avg_stride = sc.nextDouble();
      System.out.println("How many hours did you jog for:");
      int jog_hrs = sc.nextInt();
      System.out.println("How many minutes did you jog for:");
      int jog_mins = sc.nextInt();
      
      int total_mins = (jog_hrs * 60) + jog_mins;
      double distance_traveled = stride * avg_stride * total_mins;
      double d_t_in_miles = distance_traveled / 5280;
      System.out.println("You traveled " + d_t_in_miles + " miles.");
    }
}
