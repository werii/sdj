import java.util.Scanner;

public class BadCode
{

   public static void main(String[] args)
   {
     Scanner input = new Scanner(System.in);
     System.out.print("Type a number: ");
     int x = input.nextInt();
     int y;
     if (x == 1) //; <-- error
        y = 2;
     else if (x == 2) //; <-- error
        y = 3;
     else if (x == 3 /* error: only one = */) //; <-- error
        y = 4;
     else 
        y = 100; // Set default value for y
     System.out.println(y);
   }

}
