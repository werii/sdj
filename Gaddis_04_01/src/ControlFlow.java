
public class ControlFlow
{

   public static void main(String[] args)
   {
      // 4.1
      int x, y;
      // Set y equal to something
      y = 9;
      if (y == 20) 
         x = 0;
      
      // 4.2
      double payRate = 100;
      int hours = 50;
      if (hours > 40)
         payRate *= 1.5;
      
      // 4.3
      double commission;
      int sales = 50000;
      if (sales >= 10000)
         commission = 0.2;
      
      // 4.4
      int fees;
      boolean max = false;
      
      if (max)
         fees = 50;
      
      // 4.5
      int xa, ya, z;
      xa = 100;
      if (xa > 100)
      {
         ya = 20;
         z = 40;
      }
      
      // 4.6
      int a, b, c;
      a = 10;
      if (a < 10)
      {
         b = 0;
         c = 1;
      }
      
      // 4.7
      char myCharacter = 'D';
      if (myCharacter == 'D')
         System.out.print("Goodbye!");
   }

}
