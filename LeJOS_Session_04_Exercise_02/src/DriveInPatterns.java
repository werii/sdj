import lejos.nxt.MotorPort;


public class DriveInPatterns
{

   public static void main(String[] args)
   {
      // Use methods in Patterns class

      Patterns.straight(40, 90, 1);
      Patterns.pause(2);
      Patterns.turn("left");
      Patterns.pause(.25);
      Patterns.turn("left");
      Patterns.pause(.25);
      Patterns.turn("left");
      Patterns.pause(.25);
      Patterns.turn("left");
      Patterns.pause(.25);
      Patterns.straight(40, 90, 1);
      MotorPort.C.controlMotor(100, 1);
      Patterns.pause(2);
      Patterns.straight(100, 70, 1);

   }

}
