import lejos.nxt.MotorPort;
public class LejosArm
{
   public static void main(String[] args) throws InterruptedException
   {
      MotorPort.C.controlMotor(100, 1);
      Thread.sleep(1000);
   }

}
