import java.util.Scanner;

public class Stocks
{

   public static void main(String[] args)
   {
      int shares;
      double sharePrice, purchaseCommission, sellCommission, purchaseAmount, sellAmount;
      Scanner keyboard = new Scanner(System.in);
      
      // Joe purchases shares
      System.out.println("Shares purchased?");
      shares = keyboard.nextInt();
      System.out.println("Purchase price?");
      sharePrice = keyboard.nextDouble();
      
      // Commission is 2%
      purchaseCommission = 0.02 * (shares * sharePrice);
      purchaseAmount = shares * sharePrice;
      
      // Joe sells shares
      System.out.println("Shares sold?");
      shares = keyboard.nextInt();
      System.out.println("Sell price?");
      sharePrice = keyboard.nextDouble();
      
      // Commission is 2%
      sellCommission = 0.02 * (shares * sharePrice);
      sellAmount = shares * sharePrice;
      
      System.out.println("Amount of money paid for stock: " + purchaseAmount);
      System.out.println("Amount of commission paid at purchase: " + purchaseCommission);
      System.out.println("Amount of money made at sale: " + sellAmount);
      System.out.println("Amount of commission paid at sale: " + sellCommission);
      System.out.println("Amount of profit made: " + ((sellAmount - sellCommission) - (purchaseAmount + purchaseCommission)));
   }

}
