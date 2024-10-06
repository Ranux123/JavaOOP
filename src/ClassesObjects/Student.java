package ClassesObjects;

public class Student
{
  private String name;
  private int age;
  private String address;

  public Student( String name, int age, String address )
  {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public Student()
  {

  }

  public String getName()
  {
    return name;
  }

  public void setName( String name )
  {
    this.name = name;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge( int age )
  {
    this.age = age;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress( String address )
  {
    this.address = address;
  }

  @Override
  public String toString()
  {
    return ( "Student name is: " + this.getName() + ", age is: " + this.getAge() + " and address is: " + this.getAddress() );
  }

  public static void main( String[] args )
  {
    Student student = new Student( "Josh", 25, "1234 Main St" );
    System.out.println( student.toString() );

    Student student2 = new Student();
    student2.setName( "Ranuth" );
    student2.setAge( 25 );
    student2.setAddress( "Manhattan, Broadway" );

    System.out.println(student2.getName());
    System.out.println(student2.getAge());
    System.out.println(student2.getAddress());
  }
}
