public class amstrong
{
	public static void main(String[] args)
	{
	int n=153,c,r,sum=0;
	int temp=n;
	while(n>0)
	{
		r=n%10;
		c=r*r*r;
		sum=sum+c;
		n=n/10;
	}
	if(temp==sum)
	System.out.print("given number is amstrong");
	else
	System.out.print("given number is not amstrong");
	}
}
	
	