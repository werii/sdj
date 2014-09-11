import java.util.Scanner;

public class NumberSorter
{

   public static void main(String[] args)
   {
      // TODO Auto-generated method stub
      double a, b, c;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("A: ");
      a = keyboard.nextInt();
      System.out.println("B: ");
      b = keyboard.nextInt();
      System.out.println("C: ");
      c = keyboard.nextInt();
      
      if (a > b)
      {
        if (a > c)
        {
           if (b > c)
           {
              System.out.println("ABC");
           }
           else
           {
              System.out.println("ACB");
           }
        }
        else
        {
           System.out.println("CAB");
        }
      }
      else if (a < c)
      {
         if (b > c)
         {
            System.out.println("BCA");
         }
         else
         {
            System.out.println("CBA");
         }
      }
      else
      {
         System.out.println("BAC");
      }
   }
}
