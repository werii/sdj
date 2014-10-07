import javax.microedition.lcdui.Graphics;

import lejos.nxt.Button;
import lejos.nxt.LCD;

public class Screen
{
   // Utility methods for drawing to the screen
   
   // Draw the GUI box
   public void drawGUI()
   {
      // Clear the display first
      LCD.clearDisplay();
      // Draw a rectangle around the viewport
      Graphics g = new Graphics();
      g.drawRect(0, 0, 99, 62);
   }
   
   // Ask a question
   public void askQuestion(String q)
   {
      // Draw a String to the screen
      LCD.drawString(q, 0, 0);
   }

   // pick a number
   public void drawNumber(int num)
   {
      // Clears the current line first
      LCD.drawString("          ", 1, 3);
      // Draw the int in the clear space
      LCD.drawInt(num, 5, 3);
   }

   // Have user pick a number in a certain range
   public int pickInt(int low, int high)
   {
      // Enter hasn't been pressed yet...
      boolean enterPressed = false;
      
      // Start off at 0
      int number = 0;

      // Start the loop
      while(enterPressed == false)
      {
         // Draw the number to the screen
         drawNumber(number);

         // Wait for input
         int b = Button.waitForAnyPress();

         // If input is enter, leave loop
         if (b == Button.ID_ENTER)
         {
            enterPressed = true;
         }

         // If input is left, decrement number
         if (b == Button.ID_LEFT)
         {
            // Don't let number be less than lowest allowed
            if (number <= low )
            {
               continue;
            }
            number -= 10;
         }

         // If input is right, increment number
         if (b == Button.ID_RIGHT)
         {
            // Don't let number be more than highest allowed
            if (number >= high)
            {
               continue;
            }
            number += 10;
         }
      }

      // After user has pressed enter, leave the loop
      // and return the chosen value
      return number;
      
   }
   // Displays the final result
   public void displayResult(String result) throws InterruptedException
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
   
   public boolean confirm()
   {
      int buttonPressed = Button.waitForAnyPress();
      if ( buttonPressed == Button.ID_ENTER )
      {
         return true;
      }
      else if (buttonPressed == Button.ID_ESCAPE)
      {
         return false;
      }
      else 
      {
        return confirm(); 
      }
   }
}
