
public class TwoDArray
{

   public static void main(String[] args)
   {
      // Make a two dimensional array
      // And Enumerate its values

      // Make an index array
      String[][] stringArray = new String[10][10];
      for (int row = 0; row < stringArray.length; row++)
      {
         for (int i = 0; i < stringArray.length; i++)
         {
             stringArray[row][i] = "Row " + row + " Item " + i;
         }
      }
      for (int row = 0; row < stringArray.length; row++)
      {
         for (int i = 0; i < stringArray.length; i++)
         {
            System.out.println(stringArray[row][i]); 
         }
      }

   }

}
