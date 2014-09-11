
public class Tax
{

   public static void main(String[] args)
   {
      int item1 = 80, 
          item2 = 140,
          item3 = 230;
      double tax = 0.25;
      
      
      System.out.println("Item one tax: " + item1 * tax);
      System.out.println("Item one price after tax: " + (item1 + (item1*tax)));
      
      System.out.println("Item one tax: " + item2 * tax);
      System.out.println("Item one price after tax: " + (item2 + (item2*tax)));
      
      System.out.println("Item one tax: " + item3 * tax);
      System.out.println("Item one price after tax: " + (item3 + (item3*tax)));
   }

}