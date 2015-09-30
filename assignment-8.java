/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterchecker;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class CharacterChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Initialize Scanner
      Scanner sc = new Scanner(System.in);
      
      // Read in strings
      System.out.println("Please enter the first character:");
      String one_string = sc.next();
      System.out.println("Please enter the second character:");
      String two_string = sc.next();
      System.out.println("Please enter the third character:");
      String three_string = sc.next();
      System.out.println("Please enter the fourth character:");
      String four_string = sc.next();
      System.out.println("Please enter the fifth character:");
      String five_string = sc.next();
      
      // Convert to characters
      char one_char = one_string.charAt(0);
      char two_char = two_string.charAt(0);
      char three_char = three_string.charAt(0);
      char four_char = four_string.charAt(0);
      char five_char = five_string.charAt(0);
      
      // Print out total ASCII value
      int ascii_value = one_char + two_char + three_char + four_char + five_char;
      String values = one_string + ", " + two_string + ", " + three_string + ", " + four_string + ", " + five_string;
      System.out.println("The ASCII value of " + values + " is " + ascii_value + ".");
      
      // Print out last character's ASCII value
      int last_ascii_value = five_char;
      System.out.println(five_string + " has an ASCII value of " + last_ascii_value + ".");
    }
}
