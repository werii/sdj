import java.util.Scanner;


public class MyPersonalData
{

   public static void main(String[] args)
   {
      String name, address;
      int age;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("What is your name?");
      name = keyboard.nextLine();
      
      System.out.println("What is your address?");
      address = keyboard.nextLine();
            
      System.out.println("What is your age?");
      age = keyboard.nextInt();
      

      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Address: " + address);
   }
   
}
