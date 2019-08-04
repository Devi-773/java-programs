class constructor2
{ 
       int a;
	constructor2()
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
class test_program2
{
	public static void main(String[] args)
	{
	constructor2 ob=new constructor2();
	
	ob.print(ob.display());
	int d=ob.show(30);
	System.out.println(d);
	}
}