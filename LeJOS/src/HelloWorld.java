import lejos.nxt.LCD;


public class HelloWorld
{

   public static void main(String[] args) throws InterruptedException
   {
      LCD.drawString("Hello Kris", 1, 1);
      Thread.sleep(3000);
   }
}