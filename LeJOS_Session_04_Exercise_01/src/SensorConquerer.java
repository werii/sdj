public class SensorConquerer
{

   public static void main(String[] args) throws InterruptedException
   {
      // Test all the sensors
      // Using static methods defined in SensorTests class
      
      // Move the wheels
      SensorTests.testWheelMotors();
      
      // Test the arm
      SensorTests.testArm();

      // Test the sound sensor
      SensorTests.testMicSensor();
      
      // Test the ultrasonic sensor
      SensorTests.testUltraSonicSensor();
      
      // Test the light sensor
      SensorTests.testLightSensor();
      
      // Test the touch sensor
      SensorTests.testTouchSensor();
   }

}
