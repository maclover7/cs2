/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.util.Scanner;

/**
 *
 * @author 18mossj
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the type for the tree:");
      String tree_type = sc.next();
      System.out.println("Enter the age for the tree:");
      int tree_age = sc.nextInt();
      System.out.println("Enter the circumference for the tree:");
      int tree_circumference = sc.nextInt();
      System.out.println("Enter the leave colors for the tree:");
      String tree_leave_colors = sc.next();
      System.out.println("Enter the percent of leaves still on the tree:");
      int tree_percent_leaves_on_tree = sc.nextInt();
      
      Tree tree = new Tree(tree_type, tree_age, tree_circumference, tree_leave_colors, tree_percent_leaves_on_tree);
      System.out.println("Tree created successfully!");
    }
}

public class Tree {
  private int age;
  private int circumference;
  private String leave_colors;
  private int percent_leaves_on_tree;
  private String type;
  
  public Tree (){
    setType("maple");
    internalSetAge(150);
    setCircumference(55);
    internalSetPercentLeavesOnTree(50);
    internalSetLeaveColors("mixed colors", 50);
  }
  
  public Tree (String type, int age, int circumference, String leave_colors, int percent_leaves_on_tree) {
    setType(type);
    internalSetAge(age);
    setCircumference(circumference);
    internalSetPercentLeavesOnTree(percent_leaves_on_tree);
    internalSetLeaveColors(leave_colors, percent_leaves_on_tree);
  }
  
  // PUBLIC GET METHODS
  
  public int getAge() {
    return age;
  }
  
  public int getCircumference() {
    return circumference;
  }
  
  public String getLeaveColors() {
    return leave_colors;
  }
  
  public String getType() {
    return type;
  }
  
  // INTERNAL / PUBLIC SET METHODS
  
  public void setAge(int age) {
    age = age;
  }
  
  private void setLeaveColors(String leave_colors, int percent_leaves_on_tree) {
    if (percent_leaves_on_tree == 0) {
      leave_colors = "none";
    } else {
      leave_colors = leave_colors;
    }
  }
  
  public void setPercentLeavesOnTree(int percent_leaves_on_tree) {
    if (percent_leaves_on_tree > 0 && percent_leaves_on_tree > 100) {
      percent_leaves_on_tree = percent_leaves_on_tree;
    } else {
      System.out.println("Percent leaves on tree must be between 0 and 100.");
    }
  }
  
  // INTERNAL SET METHODS
  
  private void internalSetAge(int age) {
    age = age;
  }
  
  private void internalSetLeaveColors(String leave_colors, int percent_leaves_on_tree) {
    if (percent_leaves_on_tree == 0) {
      leave_colors = "none";
    } else {
      leave_colors = leave_colors;
    }
  }
  
  private void internalSetPercentLeavesOnTree(int percent_leaves_on_tree) {
    if (percent_leaves_on_tree > 0 && percent_leaves_on_tree > 100) {
        percent_leaves_on_tree = percent_leaves_on_tree;
    } else {
      System.out.println("Percent leaves on tree must be between 0 and 100.");
    }
  }
  
  private void setCircumference(int circumference) {
    circumference = circumference;
  }
  
  private void setType(String type) {
    if (type != "maple" || type != "oak") {
      System.out.println("Tree type needs to be maple or oak");
    }
  }
}
