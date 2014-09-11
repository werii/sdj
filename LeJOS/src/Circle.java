import lejos.nxt.MotorPort;


public class Circle
{

   public static void main(String[] args)
   {
      int tacho = 0;
      
      while (tacho < 6437)
      {
         MotorPort.A.controlMotor(100, 1);
         MotorPort.B.controlMotor(85, 1);
         tacho = MotorPort.A.getTachoCount();
      }
   }

}
