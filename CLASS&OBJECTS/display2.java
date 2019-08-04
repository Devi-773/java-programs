import java.lang.*;
class test
{
int a;
	void display()
	{
	System.out.println(a);
	}
}
class display2
{
	public static void main(String[] args)
	{
	test ob1=new test();
	ob1.a=10;
	test ob2=ob1;
	ob1.display();
	ob2.display();
	ob2.a=20;
	ob1=null;
	
	ob2.display();
	}
}