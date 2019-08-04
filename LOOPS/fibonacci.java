public class fibonacci
{
	public static void main(String[] args)
	{
	int i,n=10,a=0,b=1,c;
	System.out.println(a);
	System.out.println(b);
	for(i=2;i<n;i++)
	{
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	}
	}
}