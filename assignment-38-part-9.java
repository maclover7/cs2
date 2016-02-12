/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author 18mossj
 */
public class Primer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter a number:");
      int a = sc.nextInt();
      ArrayList factors = new ArrayList();
      
      for(int i = 1; i < a; i++) {
        if((a - i) % i == 0) {
          factors.add(i);
        }
      }
      
      for(int i = 0; i < factors.size(); i++) {
        System.out.println( factors.get(i) + " is a factor.");
      }
    }
}
