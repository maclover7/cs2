/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physics.quiz;
import java.util.Scanner;

/**
 *
 * @author 18mossj
 */
public class PhysicsQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // Input Data
      String[] inputString = new String[5];
      System.out.println("Please enter the original velocity:");
      inputString[0] = sc.next();
      System.out.println("Please enter the final velocity:");
      inputString[1] = sc.next();
      System.out.println("Please enter the acceleration:");
      inputString[2] = sc.next();
      System.out.println("Please enter the distance:");
      inputString[3] = sc.next();
      System.out.println("Please enter the time:");
      inputString[4] = sc.next();
      
      // Check if data is valid
      int missingDataCount = 0;
      double[] inputDouble = new double[5];
      
      for (int i = 0; i < inputString.length; i++) {
        if (inputString[i].equals("?")) {
          missingDataCount++;
        } else {
          inputDouble[i] = Double.parseDouble(inputString[i]);
        }
      }
      
      if (missingDataCount > 2 || missingDataCount > 2) {
        throw new IllegalArgumentException("Unusable data!");
      }
      
      // Calculate missing data
      // v0
      if (inputString[0].equals("?")) {
        double a = inputDouble[2];
        double t = inputDouble[4];
        double vf = inputDouble[1];

        inputDouble[0] = -1 * (a * t - vf);
        System.out.println("v0 equals " + inputDouble[0]);
        /*
          a = (vf-v0)/t
          a * t = vf - v0;
          a * t - vf = -v0;
          -1 * (a * t - vf) = v0;
        */
      }
      
      // vf
      if (inputString[1].equals("?")) {
        double a = inputDouble[2];
        double t = inputDouble[4];
        double v0 = inputDouble[1];
        
        inputDouble[1] = a * t + v0;
        System.out.println("vf equals " + inputDouble[1]);
        /*
          a = (vf-v0)/t
          a * t = vf - v0;
          a * t + v0 = vf;
        */
      }
      
      // a
      if (inputString[2].equals("?")) {
        double vf = inputDouble[1];
        double v0 = inputDouble[0];
        double t = inputDouble[4];
        
        inputDouble[2] = (vf - v0) / t;
        System.out.println("a equals " + inputDouble[2]);
      }
      
      // d
      if (inputString[3].equals("?")) {
        double vf = inputDouble[1];
        double v0 = inputDouble[0];
        double a = inputDouble[2];
        
        inputDouble[3] = ((vf * vf) - (v0 * v0)) / (a * 2);
        System.out.println("d equals " + inputDouble[3]);
      }
      
      // t
      if (inputString[4].equals("?")) {
        double a = inputDouble[2];
        double vf = inputDouble[1];
        double v0 = inputDouble[0];
        
        inputDouble[4] = (vf - v0) / a;
        System.out.println("t equals " + inputDouble[4]);
        /*
          a = (vf-v0)/t
          ta = vf - v0
          t = (vf - v0)/a
        */
      }
    }
}
