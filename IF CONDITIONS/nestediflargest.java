public class nestediflargest
{
	public static void main(String[] args)
	{
	int a=10,b=20,c=15;
	 if(a>b)
	 {
		if(a>c)
		{
		System.out.print("a is largest number");
		}
	}
	else
	{
		if((b>c)&&(b>a))
		{
	        System.out.print("b id largest number");
		}
		else
		System.out.print("c is largest number");
	}
	}
}