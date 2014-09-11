import java.util.Scanner;

public class Division
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int number1, number2;
      double quotient;
      
      System.out.println("Enter an integer: ");
      number1 = keyboard.nextInt();
      
      System.out.println("Enter another integer: ");
      number2 = keyboard.nextInt();
      
      if (number2 == 0) 
      {
         System.out.println("Please don't divide by zero!");
      }
      else
      {
         quotient = (double) number2 / number1;
         System.out.println("Quotient is: " + quotient);
      }
      keyboard.close();
   }

}