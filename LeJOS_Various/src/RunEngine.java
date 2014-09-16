import lejos.nxt.MotorPort;

public class RunEngine
{

   public static void main(String[] args) throws InterruptedException
   {
      // Plays with moving the robot
      
      // Declare and initialize counter (arbitrarily set to 3)
      int counter = 3;
      
      // Move forward for two seconds
      MotorPort.A.controlMotor(100, 1);
      MotorPort.B.controlMotor(100, 1);
      Thread.sleep(2000);
      
      // Start a loop
      // Runs three times
      while (counter > 0) {
         // Turn, by stopping one wheel and moving another
         // Turn for 500 milliseconds
         MotorPort.A.controlMotor(100, 3);
         MotorPort.C.controlMotor(90, 1);
         Thread.sleep(500);
         
         // Forward for two seconds
         MotorPort.C.controlMotor(100, 3);
         MotorPort.A.controlMotor(100, 1);
         Thread.sleep(2000);
         
         // Decrement counter
         counter--;
      }
   }
}
