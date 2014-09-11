
public class If_Else
{

   public static void main(String[] args)
   {
      // 4.8
      int x, y;
      x = 100;
      y = 100;
      if (x > 100)
         y = 20;
      else
         y = 0;
      
      // 4.9
      if (y == 100)
         x = 1;
      else
         x = 0;
      
      // 4.10
      double commission, sales;
      sales = 50000.0;
      
      if (sales == 50000.0)
         commission = 0.1;
      else
         commission = 0.2;
      
      // 4.11
      int a, b, c;
      a = 10;
      
      if (a < 10)
      {
         b = 0;
         c = 1;
      }
      else
      {
         b = -99;
         c = 0;
      }
      
   }

}
