import java.util.Scanner;

public class IntReader
{

   public static void main(String[] args)
   {
      int a,b,c;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Value for A:");
      a = keyboard.nextInt();
      
      System.out.println("Value for B:");
      b = keyboard.nextInt();

      System.out.println("Value for C:");
      c = keyboard.nextInt();

      System.out.println("Sum: " + (a+b+c));
      System.out.println("Product: " + (a*b*c));
   }

}
