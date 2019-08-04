import java.lang.Math;
class geometri
{
int l,b;
float r;
double s,h;
void area()
{
System.out.println("area of rectangle:");
l=10;
b=20;
System.out.println(l*b);
}
void area(float x)
{
 System.out.println("area of circle:");
 r=x;
 System.out.println(Math.PI*r*r);
}
void area(double x,double y)
{
 System.out.println("area of triangle:");
 s=x;
 h=y;
 System.out.println(0.5*s*h);
}
}
class areapro
{
public static void main(String[] args)
{
geometri ob1=new geometri();
ob1.area(10,5);
ob1.area(10f);
ob1.area(1,2);
}
}