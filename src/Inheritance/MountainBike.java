package Inheritance;

public class MountainBike extends Bicycle
{
  public int seatHeight;

  public MountainBike( int startSpeed, int startGear, int seatHeight )
  {
    super( startSpeed, startGear );
    this.seatHeight = seatHeight;
  }

  public int getSeatHeight()
  {
    return seatHeight;
  }

  public void setSeatHeight( int seatHeight )
  {
    this.seatHeight = seatHeight;
  }
}
