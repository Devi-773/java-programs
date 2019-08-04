class constructor
{
	constructor()
	{	
	System.out.println("Constructor");
	}
	void display()
	{
	System.out.println("hai");
	}
	void print()
	{
	display();
	System.out.println("hello");
	}
}
class test_program
{
	public static void main(String[] args)
	{
	constructor ob=new constructor();
	ob.print();
	constructor ob1= new constructor();
	}
}