
public class Controller
{

   public static void main(String[] args) throws InterruptedException
   {
      Robot robot = new Robot();
      Screen screen = new Screen();
      screen.drawNumber(screen.pickInt(0, 100));

   }

}
