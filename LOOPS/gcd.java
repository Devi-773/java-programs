public class gcd
{
	public static void main(String[] args)
	{
	int a=6,b=4,r=1;
	while(r!=0)
	{
	r=a%b;
	b=a;
	a=r;
	}
	System.out.print("gcd is"+b);

	}
}
	