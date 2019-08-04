public class coprime
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
	if(b==1)
	{
	System.out.print( "a and b are coprimes");
	}
	else
	System.out.print( "a and b are not coprimes");

	}
}
	