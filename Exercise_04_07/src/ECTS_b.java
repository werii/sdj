import java.util.Scanner;

public class ECTS_b
{

   public static void main(String[] args)
   {
      String ects;
      Integer grade = null;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter an ECTS grade");
      ects = keyboard.nextLine().toUpperCase();
      
      switch (ects)
      {
         case "A":
            grade = 12;
            break;
         case "B":
            grade = 10;
            break;
         case "C":
            grade = 7;
            break;
         case "D":
            grade = 4;
            break;
         case "E":
            grade = 2;
            break;
         case "Fx":
            grade = 0;
            break;
         case "F":
            grade = -3;
            break;
      }
      if (grade != null)
      {
         System.out.println("ECTS value: " + ects);
         System.out.println("7-grade equivalent: " + grade);
      }
      else
      {
         System.out.println("Grade: " + ects + " is off of the ECTS scale.");
      }
   }

}
