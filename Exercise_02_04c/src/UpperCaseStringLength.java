
public class UpperCaseStringLength
{

   public static void main(String[] args)
   {
      String name = "Kris";
      int stringSize = name.length();
      name = name.toUpperCase();
      System.out.println(name + " has " + stringSize + " characters");
   }

}