/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortunecookie;
import java.util.Random;
/**
 *
 * @author 18mossj
 */
public class FortuneCookie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Random global_randomizer = new Random();
      
      // Output message
      String message = generateMessage(global_randomizer);
      System.out.println("Your fortune cookie message is: '" + message + "'.");
      
      // Output 5 lucky numbers
      for(int i = 0; i < 5; i++) {
        int a = i + 10;
        int num = generateInt(a, global_randomizer);
        System.out.println("Lucky number #" + i + " is " + num + ".");
      }
    }
    
    public static int generateInt(int n, Random randomizer) {
      int num = randomizer.nextInt(n);
      
      // Regenerate number if does not fit requirement
      while (!(num > 0) && !(num > n-1)) {
        num = randomizer.nextInt(n);
      }
      
      return num;
    }
    
    public static String generateMessage(Random randomizer) {
      String[] messages = new String[3];
      messages[0] = "Fortune #1";
      messages[1] = "Fortune #2";
      messages[2] = "Fortune #3";
      
      int random = randomizer.nextInt(2 - 1 + 1) + 1;
      return messages[random];
    }
}
