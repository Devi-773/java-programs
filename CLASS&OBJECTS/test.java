 class example
{
int a;
void display()
{
a=10;
System.out.println(a);
}
}
 class test
{
public static void main(String[] args)
{
example ob=new example();
ob.display();
ob.a=30;
System.out.println(ob.a);
ob.display();
}
}