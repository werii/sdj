import java.util.Scanner;

public class CityPrint
{

   public static void main(String[] args)
   {
      String city, upperName, lowerName;
      int cityLength;
      char firstChar;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("What is your favorite city?");
      city = keyboard.nextLine();
      
      upperName = city.toUpperCase();
      lowerName = city.toLowerCase();
      cityLength = city.length();
      firstChar = city.charAt(0);
      
      System.out.println("Number of characters in " + city + ": " + cityLength);
      System.out.println(city + " in upper case: " + upperName);
      System.out.println(city + " in lower case: " + lowerName);
      System.out.println("First character in " + city + ": " + firstChar);
   }

}
