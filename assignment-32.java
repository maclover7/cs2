/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersum;
import java.util.Scanner;

/**
 *
 * @author 18mossj
 */
public class NumberSum {
  public static int diff, num, multiple;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // USER INPUT
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter a number:");
      num = sc.nextInt();
      System.out.println("Please enter a multiple:");
      multiple = sc.nextInt();
      
      // HELPER VARIABLES
      int diff = num - 1;
      int i = 0;
      int c = 0;
      
      // FOR LOOP
      for(i = 0; i < diff; i++) {
      checkMultiple(c, i, multiple);
      }
      
      // WHILE LOOP
      i = 0;
      while(i < diff) {
        checkMultiple(c, i, multiple);
        i++;
      }
      
      // DO WHILE LOOP
      i = 0;
      do{
        checkMultiple(c, i, multiple);
        i++;
      } while(i < diff);
    }
    
    // LOGIC
    public static void checkMultiple(int c, int i, int multiple) {
      c = i + 1;
        
      if (c % multiple == 0) {
        System.out.println("The number " + c + " works.");
      }
    }
}
