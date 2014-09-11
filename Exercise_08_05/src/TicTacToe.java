import java.util.Scanner;

public class TicTacToe
{

   public static void main(String[] args)
   {
      char[][] board = new char[3][3];
      
      System.out.printf(" %c | %c | %c %n", board[0][0], board[1][1], board[2][2]);
      System.out.println("-----------");
      System.out.printf(" %c | %c | %c %n", board[1][0], board[1][1], board[2][2]);
      System.out.println("-----------");
      System.out.printf(" %c | %c | %c %n", board[2][0], board[1][1], board[2][2]);

   }

}
