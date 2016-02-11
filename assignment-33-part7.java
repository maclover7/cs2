/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorer;
import java.util.HashMap;
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
      int global_average = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("How many students would you like to calculate for?");
      int student_count = sc.nextInt();
      
      for(int i = 0; i < student_count; i++) {
        // Retrieve data
        int student_counter = 0;
        System.out.println("Please enter the following data for Student #" + i + ":");
        
        System.out.println("Please enter the first test score:");
        student_counter += sc.nextInt();
        System.out.println("Please enter the second test score:");
        student_counter += sc.nextInt();
        System.out.println("Please enter the third test score:");
        student_counter += sc.nextInt();
        System.out.println("Please enter the fourth test score:");
        student_counter += sc.nextInt();
        
        // Output student's personal average
        int student_average = (student_counter / 4);
        System.out.println("Student #" + i + "'s average is " + student_average + ".");
        
        // Log to global average
        global_average += student_counter;
      }
      
      // Output all students' (class) average
      System.out.println("The class average is " + (global_average / student_count) + ".");
    }
}
