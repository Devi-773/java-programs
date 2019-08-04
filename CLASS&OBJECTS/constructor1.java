class constructor1
{ 
       int a;
	constructor1()
	{	
	a=10;
	System.out.println(a);
	}
	int display()
	{
	return a;
	}
	void print(int x)
	{
	a=x;
	System.out.println(a);
	}
	int show(int x)
	{
	return x;
	}
}
class test_program1
{
	public static void main(String[] args)
	{
	constructor1 ob=new constructor1();
	int c=ob.display();
	System.out.println(c);
	ob.print(20);
	int d=ob.show(30);
	System.out.println(d);
	}
}