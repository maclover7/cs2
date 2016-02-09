/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author 18mossj
 */
public class Practice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList scores = new ArrayList();
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter your par score:");
      int par_score = sc.nextInt();
      
      int input;
      
      while(true) {
        System.out.println("Enter the next score:");
        input = sc.nextInt();
        if (input == 0) {
          break;
        }
        scores.add(input);
      }
      
      int avg = getAverageRound(par_score, scores);
      System.out.println("Your average score is " + avg);
    }
    
    public static int getAverageRound(int par_score, ArrayList scores) {
      // Calc smallest / largest
      int smallest_number = (int) scores.get(0);
      int largest_number = (int) scores.get(0);
      for(int i = 1; i < scores.size(); i++){
        if((int) scores.get(i) > largest_number)
          largest_number = (int) scores.get(i);
        else if ((int) scores.get(i) < smallest_number)
          smallest_number = (int) scores.get(i);
      }
      
      System.out.println("Your smallest number is " + smallest_number);
      System.out.println("Your largest number is " + largest_number);
      
      // Calc gross
      int gross = 0;
      for(int i = 1; i < scores.size(); i++){
        gross = gross + (par_score - (int) scores.get(i));
      }
      
      System.out.println("Your gross number is " + gross);
      
      // Calc average
      int all = 0;
      for(int i = 1; i < scores.size(); i++){
        all += (int) scores.get(i);
      }
      
      all += par_score;
      
      int overall_avg = (all / scores.size());
      return overall_avg;
    }
}
