import lejos.nxt.MotorPort;

public class Robot
{
   // Methods that the controller can use
   
   // Move the robot forward a given distance
   public void forward(int distance, int speed)
   {
      // Figure out many tachos needed to reach desired distance
      double tachosNeeded = (distance / (5.6 * Math.PI)) * 360;

      // Declare and initialize distance traveled
      int distanceTotal = 0;

      // Clear the tachometer
      MotorPort.A.resetTachoCount();

      // Go until distance is reach (either going forward or backward)
      while(distanceTotal < tachosNeeded && distanceTotal > (-tachosNeeded))
      {
         // Control motors using designated speed
         MotorPort.A.controlMotor(speed, 1);
         MotorPort.B.controlMotor((speed - 4), 1);
         
         // Update the tachometer
         distanceTotal = MotorPort.A.getTachoCount();
      }
      
   }
   
   // Turn the robot a given number of degrees
   // NOT FINISHED - JUNK CODE :(
   public void rotate(int degrees)
   {
      // Stop motors
      MotorPort.A.controlMotor(100, 3);
      MotorPort.B.controlMotor(100, 3);

      // Clear tacho counts
      MotorPort.A.resetTachoCount();
      MotorPort.B.resetTachoCount();
      
      // Declare and set revolutions variable
      double revolutions = 0;
      double target = 0;

      // Find out how many revolutions needed
      // Do some complicated math to figure this out

      // Go for a half revolution (approximately 90 deg)
      while (revolutions < target)
      {
         MotorPort.A.controlMotor(100, 1);
         revolutions = (MotorPort.A.getTachoCount() / 360);
      }
      
      // Now stop motors again
      MotorPort.A.controlMotor(100, 3);
      MotorPort.B.controlMotor(100, 3);
   }
}
