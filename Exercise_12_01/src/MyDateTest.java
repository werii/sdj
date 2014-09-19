
public class MyDateTest
{

   public static void main(String[] args)
   {
      // Test the MyDate class
      
      // Make a new MyDate object
      MyDate date = new MyDate(1,1,1970);

      System.out.println("Leap year in: " + date.getYear() + "?: " + date.leapYear());
      System.out.println("Days in month: " + date.getLengthOfMonth());

   }

}
