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
      Circle c[] = new Circle[100];
      for (int i = 0; i < c.length; i++) {
        c[i] = new Circle(20 + i, 1, "Hi" + i);
      }
      
      System.out.println("Please enter the name you want to check for:");
      String request_name = sc.next();
      
      Circle matching_circles[] = null;
      
      for (int i = 0; i < c.length; i++) {
        if (c[i].getName() == request_name) {
          matching_circles[matching_circles.length + 1] = c[i];
        }
      }
      
      System.out.println("What do you want the radius to be changed to?:");
      int requested_radius = sc.nextInt();
      
      for (int i = 0; i < matching_circles.length; i++) {
        matching_circles[i].resetValues(requested_radius);
      }
      
      System.out.println("All done...!");
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
  public int getArea() {
    return area;
  }
  
  public int getcircumference () {
    return circumference;
  }
  
  public int getDiameter() {
    return diameter;
  }
  
  public String getName() {
    return name;
  }
  
  public int getRadius() {
    return radius;
  }
  
  // SET METHODS
  
  public void resetValues(int radius) {
    setValues(radius);
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
