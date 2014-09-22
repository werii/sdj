
public class RoomForRentTest
{

   public static void main(String[] args)
   {
      // Test the RoomForRent class
      
      RoomForRent room1 = new RoomForRent("123 Anytown, USA", 4000, new Rectangle(13, 10));
      RoomForRent room2 = new RoomForRent("234 Anyville, CANADA", 6000, new Rectangle(20, 5));

      System.out.println("Address: " + room1.getAddress());
      System.out.println("Price: " + room1.getPrice());
      System.out.println("Size: " + room1.getSize().getArea());

      System.out.println("PPSM: " + room1.getPricePerSquareMeter());
      room1.setPrice(3000);
      System.out.println("PPSM: " + room1.getPricePerSquareMeter());
   }

}
