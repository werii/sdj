import javax.swing.JOptionPane;


public class DialogPane
{

   public static void main(String[] args)
   {
     String name;
     name = JOptionPane.showInputDialog("What is your name?");
     
     System.out.println("Hello, " + name + "!");

   }

}
