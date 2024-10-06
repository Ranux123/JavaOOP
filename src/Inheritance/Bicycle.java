package Inheritance;

public class Bicycle
{
  protected int gear;
  protected int speed;

  public Bicycle(int startSpeed, int startGear )
  {
    gear = startGear;
    speed = startSpeed;
  }

  public int getGear()
  {
    return gear;
  }

  public void setGear( int gear )
  {
    this.gear = gear;
  }

  public int getSpeed()
  {
    return speed;
  }

  public void setSpeed( int speed )
  {
    this.speed = speed;
  }

  public void applyBrake( int decrement)
  {
    speed -= decrement;
  }

  public void speedUp( int increment )
  {
    speed += increment;
  }
}
