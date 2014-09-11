import java.util.Scanner;

public class NumPrinter
{

   public static void main(String[] args)
   {
      int a,b, high, low, quotient, remainder;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter first integer:");
      a = keyboard.nextInt();

      System.out.print("Enter second integer:");
      b = keyboard.nextInt();

      // Sort
      if (a > b) 
      {
         low = b;
         high = a;
      }
      else
      {
         low = a;
         high = b;
      } 
      
      System.out.println("Sorted: " + low + ", " + high);
     
      // Print Sum
      System.out.println("Sum: " + (a+b));
      
      // Quotient & Modulus
      if (b != 0)
      {
         System.out.println("Quotient: " + (a/b));
         System.out.println("Modulus: " + (a % b));
      }
      else
      {
         System.out.println("You can't do that!!!");
      }

      
   }

}
