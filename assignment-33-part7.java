/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorer;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Scorer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("How many students would you like to calculate for?");
      int student_count = sc.nextInt();
      
      for(int i = 0; i < student_count; i++) {
        System.out.println("Please enter the following data for Student #" + i + ":");
        System.out.println("Please enter the first test score:");
      }
    }
}
