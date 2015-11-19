/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic3;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Arithmetic3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter angle Beta");
      int angle = sc.nextInt();
      System.out.println("Please enter side Z");
      int sidez = sc.nextInt();
      // TODO code application logic here
    }
}

/*
Sine
Opposite
Hypotenuse
Cosine
Adjacent
Hypotenuse
---
USE:
Tangent
Opposite / Adjacent
As per the comment by leadingtoneseventh, you do use Math.asin(double a), which means arcsin and is the equivalent of inverse sin, however, inverse functions do not take radians or degrees, the value they take is a ratio, the output they give is then in radians/degrees. For the Math class the output will be in radians, so if you want it in degrees you will need to use Math.toDegrees on the return value.
*/
