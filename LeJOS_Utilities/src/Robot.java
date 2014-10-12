import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

public class Robot
{
   // Methods that the controller can use

   // Move the arm motor
   public void moveArm(String direction, int pauseDuration) throws InterruptedException
   {
      // Set the direction for the motor to turn
      int turnDirection;
      if (direction.toLowerCase().equals("right"))
      {
         turnDirection = 1; 
      }
      else
      {
         turnDirection = 2;
      }

      // Move the arm motor
      MotorPort.C.controlMotor(100, turnDirection);

      // Continue for a period of time
      Thread.sleep(pauseDuration * 1000);
      
      // Stop motor
      MotorPort.C.controlMotor(100, 3);
   }

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
      
      // Stop the wheels
      MotorPort.A.controlMotor(100, 3);
      MotorPort.B.controlMotor(100, 3);
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
      while ( distanceTraveled < tachosNeeded )
      {
         MotorPort.A.controlMotor(100, 1);
         distanceTraveled = MotorPort.A.getTachoCount();
      }

      // Now stop motors again
      MotorPort.A.controlMotor(100, 3);
      MotorPort.B.controlMotor(100, 3);
   }

   // Make the robot stop when it hits something
   public void hitWall() throws InterruptedException{

      // Initialize touch sensor on port 3
      TouchSensor touch = new TouchSensor(SensorPort.S3);

      // Declare and initialize hit boolean variable
      boolean hit = false;
      // As long as hit is still false, loop
      while(hit == false)
      {
         // Start motors
         MotorPort.A.controlMotor(100, 1);
         MotorPort.B.controlMotor(96, 1);
         // Change hit to true it touch is pressed
         if (touch.isPressed())
         {
            hit = true;
         }
         // Don't loop too fast
         Thread.sleep(100);
      }
   }
}
