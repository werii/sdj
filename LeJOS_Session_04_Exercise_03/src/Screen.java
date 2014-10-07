import javax.microedition.lcdui.Graphics;

import lejos.nxt.LCD;

public class Screen
{
   // Utility methods for drawing to the screen
   
   // Draw the GUI box
   public static void drawGUI()
   {
      // Clear the display first
      LCD.clearDisplay();
      // Draw a rectangle around the viewport
      Graphics g = new Graphics();
      g.drawRect(0, 0, 99, 62);
   }
   
   // Ask a question
   public static void askQuestion(String q)
   {
      // Draw a String to the screen
      LCD.drawString(q, 0, 0);
   }

   // Draw a number
   public static void drawNumber(int num)
   {
      // Clears the current line first
      LCD.drawString("      ", 2, 3);
      // Draw the int in the clear space
      LCD.drawInt(num, 5, 3);
   }
   
   // Draw an operation
   public static void drawOperation(String operator)
   {
      // Draws in the middle of the screen
      LCD.drawString(operator, 5, 3);
   }
   
   // Displays the final result
   public static void displayResult(String result) throws InterruptedException
   {
      // Clear display first
      LCD.clearDisplay();
      
      // Draw a header
      LCD.drawString("Result is: ", 0, 0);
      
      // Draw the result
      LCD.drawString(result, 2, 2);
      
      // Keep on the screen for a few seconds
      Thread.sleep(10000);
   }
}