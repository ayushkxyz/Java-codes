import java.lang.*;
import java.util.*;
class student
{
 public void check(String n, int m1, int m2, int m3, int m4, int m5, int m6) throws RangeException
  {
   if((m1<0 || m1>50) || (m2<0 || m2>50) || (m3<0 || m3>50) || (m4<0 || m4>50) || (m5<0 || m5>50) || (m6<0 || m6>50))
    throw new RangeException("Marks are not in range");
   System.out.println("total: "+ (m1+m2+m3+m4+m5+m6));
   System.out.println("Percentage: "+ ((m1+m2+m3+m4+m5+m6)/6.0)*100);
  }
}
class RangeException extends Exception
{
 public RangeException(String s)
 {
  super(s);
 }
}
public class demo3a
{
 public static void main(String args[])
 {
  student s = new student();
  String name = args[0];
  int m1 = Integer.parseInt(args[1]);
  int m2 = Integer.parseInt(args[2]);
  int m3 = Integer.parseInt(args[3]);
  int m4 = Integer.parseInt(args[4]);
  int m5 = Integer.parseInt(args[5]);
  int m6 = Integer.parseInt(args[6]);
  try
  {
   s.check(name, m1, m2, m3, m4, m5, m6);
  }
  catch(RangeException e)
  {
   System.out.println(e.getMessage());
  }
 }
}