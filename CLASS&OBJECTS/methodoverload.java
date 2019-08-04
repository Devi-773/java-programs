class test
{
int a,b;
	test()
	{
	System.out.println("no parameters");
	a=10;
	b=20;
	System.out.println(a+" "+b);
	}
	test(int x)
	{
	System.out.println("one parameter");
	a=x;
	b=x;
	System.out.println(a+" "+b);
	}
	test(int x,int y)
	{
	System.out.println("2 parameters");
	a=x;
	b=y;
	System.out.println(a+" "+b);
	}
}
	class overload
	{
		public static void main(String[] args)
		{
		test ob=new test();
		test ob1=new test(100);
		test ob2=new test(1,2);
		}
	}
	