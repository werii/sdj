
public class MyDate
{
   // Extend the MyDate class from Exercises 10.03 and 11.01

   // Declare the fields
   private int day;
   private int month;
   private int year;
   
   // Create the constructor
   // Has parameters for day (d), month (m), and year (y)
   public MyDate(int d, int m, int y)
   {
      // Set fields to the arguments
      this.day = d;
      this.month = m;
      this.year = y;
   }
   
   // Everything else (getters and the like):
   public int getDay()
   {
      return this.day;
   }

   public int getMonth()
   {
      return this.month;
   }
   
   public int getYear()
   {
      return this.year;
   }
   
   // Send a formatted date to the console
   public void displayDate()
   {
      System.out.printf("%d/%d/%d%n", this.day, this.month, this.year);
   }
   
   // Determine if the year is a leap year
   // divisible by four == true
   // divisible by 100 != true
   // divisible by 400 == true
   public boolean leapYear()
   {
     // Use an internal variable to make code cleaner
     // It doesn't matter that we're shadowing the field this way
     int year = this.year;
     
     // Test basic case
     if (year % 4 == 0)
     {
        // Test for every 400th year
        if (year % 400 == 0)
        {
           return true;
        }
        // Test for every 100th year
        else if (year % 100 == 0)
        {
           return false;
        }
        // If only divisible by 4, true
        else
        {
           return true;
        }
     }
     // If not divisible by 4 at all, false
     else 
     {
        return false;
     }
   }

   // Returns the amount of days in the month
   public int getLengthOfMonth()
   {
     // Use an internal variable to make code cleaner
     // It doesn't matter that we're shadowing the field this way
     int month = this.month;
     
     // Cover February changing in leap years
     if (month == 2)
     {
        if (this.leapYear() == true)
        {
           return 29;
        }
        else
        {
           return 28;
        }
     }
     
     // Use a switch statement for the rest
     switch (month)
     {
        // Case statements will fall through to the next
        // until they hit a return statement or a break
        case 1: 
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12: return 31;
        case 4:
        case 6:
        case 9:
        case 11: return 30;
        default: return -1;
     }
   }
}
