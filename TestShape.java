import java.io.*;
import java.util.*;
class shapes
{
 void perimeter(int l,int b)
 {
  double p = 2*(l+b);
  System.out.println("perimeter of the rectangle:" +p);
 }
 void perimter(int a)
 {
  double p = 4*a;
  System.out.println("perimeter of the square:" +p);
 }
 void perimeter(int r)
 {
  float pi = (float) 3.14;
  float p = (float) 2*pi*r;
  System.out.println("perimeter of the circle:" +p);
 }
 class TestShape
 {
  	public static void main(String args[])throws IOException
  	{
  		shapes ob = new shapes();
  		int l=8,b=12,a=3,r=20;
  		ob.rectangle = new.rectangle();
  		ob.square = new.square();
  		ob.circle = new.circle();
  		System.out.println(2*(l+b));
  		System.out.println(4*a);
  		System.out.println(2*pi*r);
  	}
  }
}
