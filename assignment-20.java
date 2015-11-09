/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle.work;
import java.util.Scanner;

/**
 *
 * @author 18mossj
 */
public class CircleWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // set data
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter either the radius, diameter, or circumference:");
      int input = sc.nextInt();
      System.out.println("Please enter 1 if you just typed in the radius, 2 for diameter, or 3 for the circumference");
      int input_type = sc.nextInt() ;
      System.out.println("Please enter the name for the circle:");
      String name = sc.next();
      Circle circle = new Circle(input, input_type, name);
      
      // return data
      System.out.println("The area for the circle is: " + circle.area);
      System.out.println("The circumference for the circle is: " + circle.circumference);
      System.out.println("The diameter for the circle is: " + circle.diameter);
      System.out.println("The name for the circle is: " + circle.name);
      System.out.println("The radius for the circle is: " + circle.radius);
    }
}

public class Circle {
  public int area;
  public int circumference;
  public int diameter;
  public String name;
  public int radius;
  
  public Circle(int input, int input_type, String name) {
    // set name
    name = name;
    
    // sort and get values based on `input_type` id
    if (input_type == 1) {
      setValues(input); // radius provided
    } else if (input_type == 2) {
       radius = diameter / 2; // diameter provided
       setValues(radius);
    } else if (input_type == 3) {
       radius = (int) (input / 3.14 / 2); // circumference provided
       setValues(radius);
    }
  }
  
  private void setArea(int radius) {
    area = (int) (3.14 * radius * radius);
  }
  
  private void setCircumference(int radius) {
    circumference = (int) (2 * 3.14 * radius );
  }
  
  private void setDiameter(int radius) {
    diameter = (radius * 2);
  }
  
  private void setValues(int radius) {
    setArea(radius);
    setCircumference(radius);
    setDiameter(radius);
  }
}
