package Inheritance;

public class Main
{
  public static void main( String[] args )
  {
    MountainBike mountainBike = new MountainBike( 10, 20, 2 );
    System.out.println( "Speed is " + mountainBike.speed );
    System.out.println( "Gear is " + mountainBike.gear );
    System.out.println( "Seat height is " + mountainBike.seatHeight);
    mountainBike.applyBrake( 1 );
    System.out.println( "Speed after applying brake is " + mountainBike.speed);
  }
}
