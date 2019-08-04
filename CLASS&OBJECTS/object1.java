class test
{
int a;
	test()
	{
	a=10;
	System.out.println(a);
	}
	void display(test ob)
	{
	   System.out.println(ob.a);
	   a=ob.a;
	   System.out.println(a);
	}
}
		class test_prog
		{
			public static void main(String[] args)
			{
			test ob=new test();
			ob.a=80;
			test ob1=new test();
			ob1.display(ob);
			}
		 }