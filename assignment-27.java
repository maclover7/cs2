/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intsorter;
import java.util.Scanner;

/**
 *
 * @author 18mossj
 */
public class Intsorter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] array = new int[5];
      System.out.println("Please enter an integer:");
      array[0] = sc.nextInt();
      System.out.println("Please enter an integer:");
      array[1] = sc.nextInt();
      System.out.println("Please enter an integer:");
      array[2] = sc.nextInt();
      System.out.println("Please enter an integer:");
      array[3] = sc.nextInt();
      System.out.println("Please enter an integer:");
      array[4] = sc.nextInt();
      
      int c1, c2, leng, temp;
      leng = array.length;
      
      for (c1 = 0; c1 < (leng - 1); c1++) {
        for (c2 = (c1 + 1); c2 < leng; c2++) {
          if (array[c1] > array[c2] ) {
            temp = array[c1];
            array[c1] = array[c2];
            array[c2] = temp;
          }
        }
      }
      
      System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4]);
    }
}
