import lejos.nxt.MotorPort;

public class Meter
{

   public static void main(String[] args) throws InterruptedException
   {
      int tacho_A = 0;
      
      while (tacho_A < 2050)
      {
         MotorPort.A.controlMotor(100, 1);
         MotorPort.B.controlMotor(96, 1);

         tacho_A = MotorPort.A.getTachoCount();
      }
   }
}