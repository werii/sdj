import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;

public class SensorTests
{
   // Write methods for testing each sensor
   // Note: If you run all of these in succession,
   // some of the sensors will just continue running during the subsequent tests.
   // Consider fixing this bug.

   public static void testArm() throws InterruptedException
   {
      // Print current action to screen
      LCD.drawString("Moving arm", 0, 0);

      // Move the arm motor
      MotorPort.C.controlMotor(100, 1);

      // Continue for two seconds
      Thread.sleep(2000);
   }

   public static void testMicSensor() throws InterruptedException
   {
      // Make a new sound sensor object
      SoundSensor sound = new SoundSensor(SensorPort.S2);

      // Start a loop
      // Iterate 5 times
      int count = 0;
      while(count < 5)
      {
         // Take the current reading value
         // Store value into decibel variable
         int decibel = sound.readValue();

         // Print value to screen
         LCD.drawString("Decibels: " + decibel, 0, 0);

         // Continue for two seconds
         Thread.sleep(1000);
         count++;
      }
   }

   public static void testWheelMotors() throws InterruptedException
   {
      // Start both motors
      MotorPort.A.controlMotor(100, 1);
      MotorPort.B.controlMotor(100, 1);

      // Go for a second
      Thread.sleep(1000);
      
      // Then stop
      MotorPort.A.controlMotor(100, 3);
      MotorPort.B.controlMotor(100, 3);
   }

   public static void testUltraSonicSensor() throws InterruptedException
   {
      // Make a new ultrasonic sensor object
      UltrasonicSensor ultra = new UltrasonicSensor(SensorPort.S4);

      // Start a loop
      // Show distance from objects
      // Iterate five times
      int count = 0;
      while (count < 5)
      {
         // Read distance value
         // Set that to a variable (distance)
         int distance = ultra.getDistance();

         // Draw distance on the LCD
         LCD.drawString("Distance: " + distance, 0, 0);

         // Wait a second
         Thread.sleep(1000);

         count++;
      }
   }

   public static void testLightSensor() throws InterruptedException
   {
      // Make a new light sensor object
      LightSensor light = new LightSensor(SensorPort.S1);

      // Start a loop
      // Iterate five times
      int count = 0;
      while (count < 5)
      {
         // Take brightness value
         // Set that to a variable (brightness)
         int brightness = light.getLightValue();

         // Draw value on screen 
         LCD.drawString("Brightness: " + brightness, 0, 0);

         // Continue for one second
         Thread.sleep(1000);

         // Increment count
         count++;
      }
   }

   public static void testTouchSensor() throws InterruptedException
   {
      // Make a new touch sensor object
      TouchSensor touch = new TouchSensor(SensorPort.S3);

      // Declare and set a boolean variable touched
      boolean touched = false;

      // Start a loop
      // Watch for ten seconds
      int count = 0;
      while(count < 20)
      {
         // Draw status to the screen
         LCD.clearDisplay();
         LCD.drawString("Touched: " + touched, 0, 0);

         // When the sensor is pressed, switch touched to true
         if(touch.isPressed())
         {
            touched = true;
         }

         // Wait a half second
         Thread.sleep(500);

         // Increment counter
         count++;
      }
   }
}