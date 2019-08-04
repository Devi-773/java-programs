class display
{
int a;
void display()
{
system.out.println(a);
}
}
class test
{
public static void main(String[] args)
{
display ob=new display();
ob.a=20;
ob.display();
}
}