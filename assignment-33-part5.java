/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Character {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Eneter a string:");
      String input = sc.next();
      
      for(int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        
        if (c == 'H') {}
      }
    }
}
