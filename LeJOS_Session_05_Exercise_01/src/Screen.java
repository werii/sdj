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

   // Draw a number
   public void drawNumber(int num)
   {
      // Clears the current line first
      LCD.drawString("          ", 1, 3);
      // Draw the int in the clear space
      LCD.drawInt(num, 5, 3);
   }

   // Have user pick a number in a certain range
   public int pickInt(int low, int high) throws InterruptedException
   {
      // Enter hasn't been pressed yet...
      boolean enterPressed = false;

      // Start off at high value
      int number = high;

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

         // If input is left, decrement
         if (b == Button.ID_LEFT)
         {
            // Set an inital sleep time to 200ms
            int sleepTime = 200;

            // While the button is pressed or held down
            while(Button.LEFT.isDown())
            {
               drawNumber(number);
               // Decrease the sleep time by 5ms
               // But keep it above 20ms
               if (sleepTime > 20)
               {
                  sleepTime -= 5;
               }

               // Don't let the number be less than the low limit
               if (number <= low)
               {
                  continue;
               }
               else
               {
                  // Decrement by one
                  number -= 1;
               }
               // Sleep 
               Thread.sleep(sleepTime);
            }
         }

         // If input is right, increment
         if (b == Button.ID_RIGHT)
         {
            // Set an inital sleep time to 200ms
            int sleepTime = 150;

            // While the button is pressed or held down
            while(Button.RIGHT.isDown())
            {
               drawNumber(number);
               // Decrease the sleep time by 5ms
               // But keep it above 20ms
               if (sleepTime > 20)
               {
                  sleepTime -= 5;
               }

               // Don't let the number be more than the high limit
               if (number >= high)
               {
                  continue;
               }
               else
               {
                  // Increment by one
                  number += 1;
               }
               // Sleep 
               Thread.sleep(sleepTime);
            }
         }
      }
      // After user has pressed enter, leave the loop
      // and return the chosen value
      return number;
   }

   // Ask for user confirmation
   // Uses enter and escape keys
   // Returns either true or false
   public boolean confirm()
   {
      // Record user input
      int buttonPressed = Button.waitForAnyPress();

      // If enter, return true
      if ( buttonPressed == Button.ID_ENTER )
      {
         return true;
      }
      // If escape, return false
      else if (buttonPressed == Button.ID_ESCAPE)
      {
         return false;
      }
      // If neither enter nor escape, run method again (recursion)
      else 
      {
         return confirm(); 
      }
   }
}
