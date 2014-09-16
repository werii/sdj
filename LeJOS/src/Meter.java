import lejos.nxt.MotorPort;

public class Meter
{

   public static void main(String[] args) throws InterruptedException
   {
      // Drive the robot a meter
      
      // Declare and initialize tachometer count
      int tacho_A = 0;
      
      // 2050 (degrees wheel has rotated) is about a meter
      while (tacho_A < 2050)
      {
         // Start motors
         MotorPort.A.controlMotor(100, 1);
         MotorPort.B.controlMotor(96, 1);

         // Update tachometer
         tacho_A = MotorPort.A.getTachoCount();
      }
   }
}