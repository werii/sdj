
public class StarPrint
{

   public static void main(String[] args)
   {
      int counter = 1;
      while(counter < 8)
      {
         if (counter == 1)
         {
            System.out.println("   *");
         }
         if (counter == 3)
         {
            System.out.println("  ***");
         }
         if (counter == 5)
         {
            System.out.println(" *****");
         }
         if (counter == 7)
         {
            System.out.println("*******");
         }
         counter += 2;
      }
      counter = 5;
      while (counter > 0)
      {
         if (counter == 5)
         {
            System.out.println(" *****");
         }
         if (counter == 3)
         {
            System.out.println("  ***");
         }
         if (counter == 1)
         {
            System.out.println("   *");
         }
         counter -= 2;
      }
   }
}
