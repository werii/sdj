import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

public class HitWall
{

   public static void main(String[] args) throws InterruptedException
   {
      // Make the robot stop when it hits something
      
      // Declare and initialize hit boolean variable
      boolean hit = false;
      
      // Initialize touch sensor on port 3
      TouchSensor touch = new TouchSensor(SensorPort.S3);

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
