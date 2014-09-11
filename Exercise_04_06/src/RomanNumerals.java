import java.util.Scanner;

public class RomanNumerals
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int number;
      String numeral; 

      System.out.println("Enter a number from 1-10");
      number = keyboard.nextInt();
      
      switch (number)
      {
         case 1:
            numeral = "I";
            break;
         case 2:
            numeral = "II";
            break;
         case 3:
            numeral = "III";
            break;
         case 4:
            numeral = "IV";
            break;
         case 5:
            numeral = "V";
            break;
         case 6:
            numeral = "VI";
            break;
         case 7:
            numeral = "VII";
            break;
         case 8:
            numeral = "VIII";
            break;
         case 9:
            numeral = "IX";
            break;
         case 10:
            numeral = "X";
            break;
         default:
            numeral = "";
      }

      if (numeral != "")
        System.out.println("Corresponding numeral to " + number + " is: " + numeral); 
      else
      {
         System.out.println("Error! Not between 1-10");
      }
   }

}
