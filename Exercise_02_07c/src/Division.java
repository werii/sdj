import java.util.Scanner;

public class Division
{

   public static void main(String[] args)
   {
      // Get the quotient of two numbers
      // Get the numbers from the user
      
      // Get a scanner object
      Scanner keyboard = new Scanner(System.in);
      
      // Instantiate variables
      int number1, number2;
      double quotient;
      
      // Get values from the user
      System.out.println("Enter an integer: ");
      number1 = keyboard.nextInt();
      
      System.out.println("Enter another integer: ");
      number2 = keyboard.nextInt();
      
      // Prevent divide by zero errors
      if (number2 == 0) 
      {
         System.out.println("Please don't divide by zero!");
      }
      else
      {
         // Use casting to prevent integer division
         // Find quotient, print result
         quotient = (double) number2 / number1;
         System.out.println("Quotient is: " + quotient);
      }
      // Close the object to prevent memory waste 
      // (I'm just playing around with this, this does nothing here because the program is ending anyways)
      keyboard.close();
   }

}