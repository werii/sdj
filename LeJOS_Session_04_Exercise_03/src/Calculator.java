import lejos.nxt.Button;

public class Calculator
{
   // The primary method
   // Uses the other two class methods
   public static void calculate() throws InterruptedException
   {
      // Declare method variables
      int first;
      int second;
      String operator;
      
      // Set final result variable to 0 (just a placeholder value)
      double result = 0;

      // Run the other static methods to get values from user
      first = setNumber("first");
      operator = setOperator();
      second = setNumber("second");

      // Run operation
      // depending on operator chosen
      if (operator.equals("+"))
      {
         result = first + second;
      }

      if (operator.equals("-"))
      {
         result = first - second;
      }

      if (operator.equals("*"))
      {
         result = first * second;
      }

      if (operator.equals("/"))
      {
         result = (double) first / second;
      }
      
      // Display result to screen
      Screen.displayResult("" + result);
   }


   // Get a number from the user
   // calls with an "order" argument
   // just for cosmetic purpose
   private static int setNumber(String order)
   {
      // Enter hasn't been pressed yet...
      boolean enterPressed = false;
      
      // Start off at 1
      int number = 1;

      // Draw the GUI
      Screen.drawGUI();
      // Ask the question (using the given argument)
      Screen.askQuestion("Enter the " + order + " number:");

      // Start the loop
      while(enterPressed == false)
      {
         // Draw the number to the screen
         Screen.drawNumber(number);

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
            number--;
         }

         // If input is right, increment number
         if (b == Button.ID_RIGHT)
         {
            number++;
         }
      }

      // After user has pressed enter, leave the loop
      // and return the chosen value
      return number;
   }

   // Get an operator from the user
   private static String setOperator()
   {
      // Make an array of operators
      String[] operatorHolder = {"+", "-", "*", "/"};
      // Set the pointer to 0
      int i = 0;
      
      // Enter hasn't been pressed yet
      boolean enterPressed = false;

      // Draw the GUI
      Screen.drawGUI();
      
      // Ask the question
      Screen.askQuestion("Operator:");

      // Start the loop
      while (enterPressed == false)
      {
         // Draw operator to the screen
         Screen.drawOperation(operatorHolder[i]);
         
         // Wait for input
         int b = Button.waitForAnyPress();

         // When user hits enter, leave the loop
         if (b == Button.ID_ENTER)
         {
            enterPressed = true;
         }
         
         // If user hits left, move pointer to the left
         // unless it's already all the way to the left
         if (b == Button.ID_LEFT)
         {
            if (i == 0)
            {
               continue;
            }
            else
            {
               i--;
            }
         }
         // If user hits right, move pointer to the right
         // unless it's already all the way to the right
         if (b == Button.ID_RIGHT)
         {
            if (i == 3)
            {
               continue;
            }
            else
            {
               i++;
            }
         }
      }

      // When loop ends, return the value the user chose
      return operatorHolder[i];
   }

}