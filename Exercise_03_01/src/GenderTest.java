import java.util.Scanner;
public class GenderTest
{

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Type gender (M or F or Awesome)");
      String line = input.nextLine();
      char gender = line.charAt(0);
      if (gender == 'M')
         System.out.print("Male");
      else
         System.out.print("Not a Male");
   }

}
