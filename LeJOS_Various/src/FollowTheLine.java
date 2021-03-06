import lejos.nxt.LightSensor;
import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;


public class FollowTheLine
{

   public static void main(String[] args) throws InterruptedException
   {
      // UNFINISHED!!!
      // Follow a black line using the light sensor
      // Ideas: 
      // Continue forward only when line is found
      // Shake wildly to find line

      LightSensor light = new LightSensor(SensorPort.S1);
      boolean stop = false;

      while (!stop)
      {
         MotorPort.A.controlMotor(100, 1);
         MotorPort.B.controlMotor(96, 1);

         // 40 seems to work for black value
         if (light.readValue() > 40)
         {
            MotorPort.A.controlMotor(100, 3); 
         }

         Thread.sleep(200);

      }
   }
}
