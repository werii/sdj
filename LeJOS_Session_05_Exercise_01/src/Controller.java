import java.util.ArrayList;

//  1. Prepare a series of datasets
//  2. Each dataset contains three values (speed, distance, angle)
//  3. Enter datasets until user is finished ("Route Finished")
//  4. Wait for start signal from user
//  5. Execute the inputted route
public class Controller
{
   // Data (model)
   ArrayList<DataSet> dataSet = new ArrayList<>();
   // User input (view)
   Screen view = new Screen();
   // Movement methods
   Robot robot = new Robot();

   public static void main(String[] args) throws InterruptedException
   {
      Controller controller = new Controller();
      controller.run();
   }

   public void run() throws InterruptedException
   {
      // First loop - get input
      while(moreInput())
      {
         // Declare placeholder variables
         int angle, speed, distance;

         // Draw a new GUI
         view.drawGUI();

         // Get the speed from the user
         view.askQuestion("Speed?");
         speed = view.pickInt(0, 100);

         // Get the angle from the user
         view.askQuestion("Angle?");
         angle = view.pickInt(-180, 180);

         // Get the distance from the user
         view.askQuestion("Distance?");
         distance = view.pickInt(0, 100);

         // Store data in a new DataSet
         storeDataSet(angle, speed, distance);
      }

      // Second loop - drive according to data
      while(!view.confirm())
      {
         view.askQuestion("Enter when Ready");
      }
      move();
   }

   // Asks if user wants to continue
   public boolean moreInput()
   {
      view.drawGUI();
      view.askQuestion("More Input?");
      return view.confirm();
   }

   // 
   public void storeDataSet(int angle, int speed, int distance)
   {
      DataSet newSet = new DataSet();
      newSet.setAngle(angle);
      newSet.setSpeed(speed);
      newSet.setDistance(distance);
      dataSet.add(newSet);
   }

   public void move() throws InterruptedException
   {
      // Drive according to data!
      for (int i = 0; i < dataSet.size(); i++)
      {
         int speed = dataSet.get(i).getSpeed();
         int distance = dataSet.get(i).getDistance();
         int angle = dataSet.get(i).getAngle();
         view.drawGUI();
         view.drawNumber(i+1);
         int x = 0;
         while (x < 50 )
         {
            robot.forward(distance, speed);
            robot.rotate(angle);
            x++;
         }
      }
   }
}