import lejos.nxt.*;

public class Sensor
{
   // Get value from the Mic Sensor
   public int readMicSensor()
   {
      // Make a new sound sensor object
      SoundSensor sound = new SoundSensor(SensorPort.S2);
      
      // Return the current Sound value
      return sound.readValue();
   }

   // Get value from the UltraSonic Sensor
   public int readUltraSonicSensor()
   {
      // Make a new ultrasonic sensor object
      UltrasonicSensor ultra = new UltrasonicSensor(SensorPort.S4);
      
      // Return the current Distance value
      return ultra.getDistance();
   }

   // Get a value from the Light Sensor
   public int readLightSensor()
   {
      // Make a new light sensor object
      LightSensor light = new LightSensor(SensorPort.S1);

      // Return the current Light value
      return light.getLightValue();
   }

   // Get a value from the Touch Sensor
   public boolean readTouchSensor()
   {
      // Make a new touch sensor object
      TouchSensor touch = new TouchSensor(SensorPort.S3);

      // Return whether or not the sensor is pressed
      return touch.isPressed();

   }
}