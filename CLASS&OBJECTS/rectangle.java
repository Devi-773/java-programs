class rectangle
{
int l, b;
void area()
{
int area ;
area=l*b;
System.out.println("area="+area);
}
void perimeter()
{
int p;
p=2*(l+b);
System.out.println("perimeter="+p);
}
}
class rectangle1
{
public static void main(String[] args)
{
rectangle ob1=new rectangle();
ob1.l=10;
ob1.b=5;
ob1.area();
ob1.perimeter();
}
}