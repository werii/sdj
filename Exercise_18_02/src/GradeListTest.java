
public class GradeListTest
{
   // Class copied from Exercise 18.02A
   public static void main(String[] args)
   {
      System.out.println("// Test class Grade");
      System.out.println("Create a Grade object with \"SDJ\" and grade = -3");
      Grade grade1 = new Grade("SDJ", -3);
      System.out.println("Course name = " + grade1.getCourseName());
      System.out.println("Grade = " + grade1.getGrade());
      System.out.println("Method toString(): \n" + grade1);
      System.out.println("Set grade to 12");
      grade1.setGrade(12);
      System.out.println("Grade = " + grade1.getGrade());
      System.out.println("Method toString(): \n" + grade1);

   }

}
