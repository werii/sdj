import lejos.nxt.LCD;
import lejos.nxt.MotorPort;

public class Patterns
{
   // Pause for a given number of seconds
   public static void pause(double seconds)
   {
      // Using a try/catch block
      // Instead of a throws declaration
      try
      {
         Thread.sleep((int) (seconds * 1000));
      }
      catch (InterruptedException e)
      {
         e.printStackTrace();
      } 
   }

   // Go straight for a given distance (in cm)
   public static void straight(double distance, int speed, int direction)
   {
      // Figure out distance in each revolution (circumference)
      double revolutionDistance = 5.6 * Math.PI;

      // Figure out many revolutions needed to reach desired distance
      double revolutionsNeeded = (distance / revolutionDistance);

      // Then multipy by 360 for tachos
      double tachosNeeded = revolutionsNeeded * 360;
      
      // Declare and initialize distance traveled
      int distanceTotal = 0;

      // Clear the tachometer
      MotorPort.A.resetTachoCount();

      // Go until distance is reach (either going forward or backward)
      while(distanceTotal < tachosNeeded && distanceTotal > (tachosNeeded * -1))
      {
         // Control motors using arguments
         MotorPort.A.controlMotor(speed, direction);
         MotorPort.B.controlMotor((speed - 4), direction);
         
         // Update the tachometer
         distanceTotal = MotorPort.A.getTachoCount();
      }
   }

   // Turn 90 degrees right or left
   public static void turn(String direction)
   {
      // Stop motors
      MotorPort.A.controlMotor(100, 3);
      MotorPort.B.controlMotor(100, 3);

      // Clear tacho counts
      MotorPort.A.resetTachoCount();
      MotorPort.B.resetTachoCount();
      
      // Declare and set revolutiosn variable
      double revolutions = 0;

      // If instruction is "right"
      if (direction.toLowerCase().equals("right"))
      {
         // Go for a half revolution (approximately 90 deg)
         while (revolutions < 0.5)
         {
            MotorPort.A.controlMotor(100, 1);
            revolutions = (MotorPort.A.getTachoCount() / 360);
         }
      }
      // if instruction is "left"
      else if (direction.toLowerCase().equals("left"))
      {
         // Go for a half revolution (approximately 90 deg)
         while (revolutions < 0.5)
         {
            MotorPort.B.controlMotor(100, 1);
            revolutions = (MotorPort.B.getTachoCount() / 360);
         }
      }
      // If neither "right" nor "left", do nothing and display an error
      else 
      {
         LCD.drawString("Instruction Error", 0, 0);
         pause(2);
      }
      
      // Now stop motors again
      MotorPort.A.controlMotor(100, 3);
      MotorPort.B.controlMotor(100, 3);
   }

   public static void square()
   {
      
   }
}
