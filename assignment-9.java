/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add.three.numbers.function;

/**
 *
 * @author 18mossj
 */
public class AddThreeNumbersFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
      int a = 1;
      int b = 2;
      int c = 3;
      int sum = addThreeNumbers(a, b, c);
      System.out.println(a + " + " + b + " + " + c + " = " + sum);
    }
    
    public static int addThreeNumbers(int a, int b, int c) {
      int return_value = a + b + c;
      return return_value;
    }
}
