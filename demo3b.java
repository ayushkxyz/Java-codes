import java.lang.*;
import java.util.*;
class temperature
{
 public float temp;
 public void read()
 {
  System.out.println("Enter the temperature: ");
  Scanner s = new Scanner(System.in);
  temp = s.nextFloat();
  try
  {
   if(temp==0)
   {
    throw new ArithmeticException("temperature cannot be zero");
   }
  }
  catch(ArithmeticException e)
  {
   System.out.println(e.getMessage());
  }
  finally
  {
   System.out.println("In finally block");
  }
 }
 public void display()
 {
  System.out.println("Temperature is: " + temp + " deg C");
 }
}
public class demo3b
{
 public static void main(String args[])
 {
  temperature t1 = new temperature();
  t1.read();
  t1.display();
 }
}