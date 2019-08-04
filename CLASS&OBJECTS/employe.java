import java.util.Scanner;
class employe
{
String name;
int id;
String address;
int salary;
	void input()
	{
		Scanner sd=new Scanner(System.in);
		System.out.print("enter employ id");
		id=sd.nextInt();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter employ name");
		 name=sc.nextLine();
		Scanner se=new Scanner(System.in);
		System.out.print("enter employ address");
		 address=se.nextLine();
		Scanner sf=new Scanner(System.in);
		System.out.print("enter employ salary");
		salary=sf.nextInt();
	}
	void output()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(address);
		System.out.println(salary);
	}
}
class test
{
	public static void main(String[] args)
	{
	employe e1=new employe();
	e1.input();
	e1.output();
	}
}	
