import java.util.Scanner;
public class input
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int a=sc.nextInt();
	System.out.print(a);
	Scanner sd=new Scanner(System.in);
	System.out.println("enter a float number");
	float b=sd.nextFloat();
	System.out.print(b);
	Scanner se=new Scanner(System.in);
	System.out.println("enter a string");
	String c=se.nextLine();
	System.out.println(c);
	Scanner sf=new Scanner(System.in);
	System.out.println("enter a double number");
	double d=sf.nextDouble();
	System.out.print(d);
	
	}
}