package person.pkgclass;
import java.util.Scanner;

public class PersonClass {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Input the gender for the first person (male or female):");
     String gdr1 = sc.next();
     System.out.println("Input the height for the first person (as an integer):");
     int ht1 = sc.nextInt();
     System.out.println("Input the weight for the first person (as an integer):");
     int wt1 = sc.nextInt();.
     System.out.println("Input the age for the first person (as an integer):");
     int age1 = sc.nextInt();
     System.out.println("Input the hair color for the first person:");
     String hair1 = sc.next();
     System.out.println("Input the name for the first person:");
     String name1 = sc.next();
     //
     System.out.println("Input the gender for the second person (male or female):");
     String gdr2 = sc.next();
     System.out.println("Input the height for the second person (as an integer):");
     int ht2 = sc.nextInt();
     System.out.println("Input the weight for the second person (as an integer):");
     int wt2 = sc.nextInt();
     System.out.println("Input the age for the second person (as an integer):");
     int age2 = sc.nextInt();
     System.out.println("Input the hair color for the second person:");
     String hair2 = sc.next();
     System.out.println("Input the name for the second person:");
     String name2 = sc.next();
     
     Person p1 = new Person(gdr1, ht1, wt1, age1, hair1, name1, eye1);
     Person p2 = new Person(gdr2, ht2, wt2, age2, hair2, name2, eye2);
     
     if (p1.height > p2.height) {
       System.out.println("Person 1 is taller than person 2.");
     } else {
       System.out.println("Person 2 is taller than person 1.");
     }
   }
}

public class Person {
  public int age;
  public String hair_color;
  public String eye_color;
  public String gender;
  public int height;
  public String name;
  public int weight;
  
  
  public Person(String gdr, int ht, int wt, int a, String hr_clr, String nm, String eye_clr){
    age = a;
    hair_color = hr_clr;
    eye_color = eye_clr;
    gender = gdr;
    height = ht;
    name = nm;
    weight = wt;
  }
}
