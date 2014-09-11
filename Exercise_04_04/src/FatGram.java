import java.util.Scanner;
public class FatGram
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      double calories, fatGrams, caloriesFromFat, percentCaloriesFromFat;
      
      // Get calories and fat grams
      System.out.println("How many calories?");
      calories = keyboard.nextDouble();
      System.out.println("How many grams of fat?");
      fatGrams = keyboard.nextDouble();

      caloriesFromFat = fatGrams * 9;
      percentCaloriesFromFat = caloriesFromFat / calories;
      
      if (caloriesFromFat > calories)
      {
         System.out.println("Calories from fat (" + caloriesFromFat + "), cannot exceed total calories (" + calories + ")");
      }
      else 
      {
         if (caloriesFromFat < (calories * .3))
         {
            System.out.println("This is a low fat food!");
         }
         System.out.println("Percent of calories from fat: " + (int) (100 * percentCaloriesFromFat) + "%");
      }
   }
}
