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
      System.out.println("The area for the circle is: " + circle.getArea());
      System.out.println("The circumference for the circle is: " + circle.getCircumference());
      System.out.println("The diameter for the circle is: " + circle.getDiameter());
      System.out.println("The name for the circle is: " + circle.getName());
      System.out.println("The radius for the circle is: " + circle.getRadius());
    }
}

public class Circle {
  private int area;
  private int circumference;
  private int diameter;
  private String name;
  private int radius;
  
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
  
  // GET METHODS
  private int getArea() {
    return area;
  }
  
  private int getcircumference () {
    return circumference;
  }
  
  private int getDiameter() {
    return diameter;
  }
  
  private String getName() {
    return name;
  }
  
  private int getRadius() {
    return radius;
  }
  
  // SET METHODS
  
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
