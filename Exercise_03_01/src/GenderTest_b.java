import java.util.Scanner;
public class GenderTest_b
{

   public static void main(String[] args)
   {
      int age;
      Scanner input = new Scanner(System.in);
      System.out.print("Input age");
      age = input.nextInt();
      input.nextLine();

      System.out.print("Type gender (M or F)");
      String line = input.nextLine();
      char gender = line.charAt(0);
      
      if (age >= 18)
      {
        if (gender == 'F')
         System.out.print("Woman");
        else
         System.out.print("Man");
      }
      else
      {
         if (gender =='F')
            System.out.print("Girl");
         else
            System.out.print("Boy");
      }
   }

}
   