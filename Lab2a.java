import java.util.*;
class A{
private int a,b;
protected float d,e;
public int f,g;
    public A(){
   a=10;
   b=20;
   d=30;
   e=40;
   f=50;
   g=60;
   System.out.println("IN Default constructor OF A");

}
public void display(){
 System.out.println("IN DISPLAY OF A");
}
}
class B extends A{
     public int x;
   public B(){
          x=2;
         System.out.println("IN Default constructor Of B");
   }
   public B(int x){
   this.x=x;
   System.out.println("IN Parameterized constructor Of B");

   }
 public void display(){
     System.out.println("IN Display of B");
   }

}
class C extends B{
   public int y;
   public C(){
          y=45;
         System.out.println("IN Default constructor OF C");
   }
   public C(int y,int n){
       this.y=y;
   System.out.println("IN Parameterized constructor Of C");

   }



}
class D extends B{
    public int z;
public D(){
          z=0;
         System.out.println("IN Default constructor OF D");
   }
public D(int z,int x){
   super(x);
   this.z=z;
   System.out.println("IN Parameterized constructor Of D");

   }
}
public class Lab2a{

public static void main(String args []){

    B obj1= new B();
    obj1.display();
    C obj2=new C(2,21);
    
    
}

}