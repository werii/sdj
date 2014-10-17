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
   public void rotate(int degrees)
   {
      // Magic number
      // Found by taking the circumference of a full rotation,
      // and figuring out how much the wheels need to turn to reach that
      double tachosInFullRotation = 1286;
      
      // Find tachos needed to meet the number of degrees specified
      double tachosNeeded = tachosInFullRotation * ((double) degrees / 360);

      // Stop motors
      MotorPort.A.controlMotor(100, 3);
      MotorPort.B.controlMotor(100, 3);

      // Clear tacho counts
      MotorPort.A.resetTachoCount();
      MotorPort.B.resetTachoCount();
      
      // Go until distance traveled is equal to the distance needed
      double distanceTraveled = 0;
      
      // NOTE: following code should be refactored

      // If degrees entered was positive
      // Turn right
      if (tachosNeeded >= 0)
      {
         while ( distanceTraveled < tachosNeeded )
         {
            MotorPort.A.controlMotor(100, 1);
            distanceTraveled = MotorPort.A.getTachoCount();
         }
      }
      // If degrees entered was negative
      // Turn left
      else
      {
         while ( distanceTraveled < -tachosNeeded )
         {
            MotorPort.B.controlMotor(100, 1);
            distanceTraveled = MotorPort.B.getTachoCount();
         }
         
      }
      // Now stop motors again
      MotorPort.A.controlMotor(100, 3);
      MotorPort.B.controlMotor(100, 3);
   }
}
