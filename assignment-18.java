// FILE 1
package person.pkgclass;
import java.util.Calendar;
import java.util.Scanner;

public class PersonClass {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Input the gender for the first person (male or female):");
     String gdr1 = sc.next();
     System.out.println("Input the height for the first person (as an integer):");
     int ht1 = sc.nextInt();
     System.out.println("Input the weight for the first person (as an integer):");
     int wt1 = sc.nextInt();
     System.out.println("Input the age for the first person (as an integer):");
     int age1 = sc.nextInt();
     System.out.println("Input the hair color for the first person:");
     String hair1 = sc.next();
     System.out.println("Input the name for the first person:");
     String name1 = sc.next();
     System.out.println("Input the eye color for the first person:");
     String eye1 = sc.next();
     Calendar calendar1 = Calendar.getInstance();
     System.out.println("Input the year of birth for the first person (as an integer):");
     int year1 = sc.nextInt();
     calendar1.set(Calendar.YEAR, year1);
     System.out.println("Input the month of birth for the first person (as an integer):");
     int month1 = sc.nextInt();
     calendar1.set(Calendar.MONTH, month1);
     System.out.println("Input the day of birth for the first person (as an integer):");
     int day1 = sc.nextInt();
     calendar1.set(Calendar.DATE, day1);
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
     System.out.println("Input the eye color for the second person:");
     String eye2 = sc.next();
     Calendar calendar2 = Calendar.getInstance();
     System.out.println("Input the year of birth for the second person (as an integer):");
     int year2 = sc.nextInt();
     calendar1.set(Calendar.YEAR, year2);
     System.out.println("Input the month of birth for the second person (as an integer):");
     int month2 = sc.nextInt();
     calendar1.set(Calendar.MONTH, month2);
     System.out.println("Input the day of birth for the second person (as an integer):");
     int day2 = sc.nextInt();
     calendar1.set(Calendar.DATE, day2);
     
     Person p1 = new Person(gdr1, ht1, wt1, age1, hair1, name1, eye1, calendar1);
     Person p2 = new Person(gdr2, ht2, wt2, age2, hair2, name2, eye2, calendar2);
     
     if (p1.height > p2.height) {
       System.out.println("Person 1 is taller than person 2.");
     } else {
       System.out.println("Person 2 is taller than person 1.");
     }
   }
}

// FILE 2
package person.pkgclass;
import java.util.Calendar;

public class Person {
  public int age;
  public Calendar date_of_birth;
  public String hair_color;
  public String eye_color;
  public String gender;
  public int height;
  public String name;
  public int weight;
  
  
  public Person(String gdr, int ht, int wt, int a, String hr_clr, String nm, String eye_clr, Calendar dob){
    age = a;
    setDateOfBirth(dob);
    hair_color = hr_clr;
    setEyeColor(eye_clr);
    setGender(gdr);
    gender = gdr;
    setHeight(ht);
    name = nm;
    setWeight(wt);
  }
  
  private void setDateOfBirth(Calendar dob){
    Calendar cal = Calendar.getInstance();
    if (dob.after(cal)) {
      throw new IllegalArgumentException("Date cannot be in the future.");
    } else {
      date_of_birth = dob;
    } 
  }
  
  private void setEyeColor(String eye_clr){
    if (eye_clr != "blue" || eye_clr != "brown" || eye_clr != "green"){
      eye_color = eye_clr;
    } else {
      throw new IllegalArgumentException("Eye color must be either blue, brown, or green.");
    }
  }
  
  private void setGender(String gdr){
    if (gdr != "male" || gdr != "female"){
      gender = gdr;
    } else {
      throw new IllegalArgumentException("Gender does not equal male or female.");
    }
  }
  
  private void setHeight(int ht){
    if (ht > 40){
      if (ht < 75){
        height = ht;
      } else {
        throw new IllegalArgumentException("Height must be less than 75, but more than 40.");
      }
    } else {
      throw new IllegalArgumentException("Height must be less than 75, but more than 40.");
    }
  }
  
  private void setWeight(int wt){
    if (wt > 100){
      if (wt < 250){
        weight = wt;
      } else {
        throw new IllegalArgumentException("Weight must be less than 250, but more than 100.");
      }
    } else {
      throw new IllegalArgumentException("Height must be less than 250, but more than 100.");
    }
  }
}
