import lejos.nxt.MotorPort;


public class Circle
{

   public static void main(String[] args)
   {
      // Move robot in a big circle
      // A proof of concept
      
      // Declare and initialize tachometer
      int tacho = 0;
      
      // 6437 is about how long it takes for robot to travel a full circle
      while (tacho < 6437)
      {
         // One wheel full power, the other 85% power
         MotorPort.A.controlMotor(100, 1);
         MotorPort.B.controlMotor(85, 1);

         // Update tachometer every loop cycle
         tacho = MotorPort.A.getTachoCount();
      }
   }

}
