import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.navigation.DifferentialPilot;

public class SonicSensor
{

   public static void main(String[] args) throws InterruptedException
   {
      // USES A PILOT - NEEDS REWRITING!!!
      // 1) Make robot stop 50cm in front of an obstacle or if touch sensor is press
      // 2) Make robot turn left if it stopped from light sensor
      // and turn right if stopped from touch sensor
      // Program continues until it has turned 10 times

      TouchSensor touchSensor = new TouchSensor(SensorPort.S3);
      UltrasonicSensor soundSensor = new UltrasonicSensor(SensorPort.S4);
     
      DifferentialPilot pilot = new DifferentialPilot(56, 110, Motor.A, Motor.B);

      int counter = 0;

      while(counter < 10)
      {
         pilot.forward();

         if (touchSensor.isPressed())
         {
            pilot.rotate(90);
            counter++;
         }

         if (soundSensor.getDistance() < 50)
         {
            pilot.rotate(-90);
            counter++;
         }

         Thread.sleep(80);
      }
   }
}