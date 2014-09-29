import java.util.ArrayList;


public class Controller
{
   ArrayList<DataSet> dataSet;

   public static void main(String[] args)
   {
      Controller con = new Controller();
      con.run();
   }
   
   public void run()
   {
      while(moreInput())
      {
         int a, s, d;
         // Should get user input here
         // instead of hard-coding values
         a = 95;
         s = 75;
         d = 100;

         DataSet ds = new DataSet();
         ds.SetAngle(a);
         dataSet.add(ds);
         
      }
   }
   
   public boolean moreInput()
   {
      LCD.clear();
      LCD.drawString("More Input?", 1,1);
      int b = Button.waitForAnyPress();
      if ( b == Button.ID_ENTER)
      {
         return true;
      }
      else
      {
         return false;
      }
   }

}
