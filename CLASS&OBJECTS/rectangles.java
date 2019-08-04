class rectangles
{
int l, b;
void area(int x,int y)
{
l=x;
b=y;
int area ;
area=l*b;
System.out.println(area);
}
void perimeter(int x,int y)
{
l=x;
b=y;
int p;
p=2*(l+b);
System.out.println(p);
}
}
class rectangle2
{
public static void main(String[] args)
{
rectangles ob1=new rectangles();
int a=10,b=5;
ob1.area(a,b);
ob1.perimeter(a,b);
}
}