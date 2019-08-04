import java.util.Scanner;
public class perfect
{
	public static void main(String[] args)
	{
	int n,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter number");
	n=sc.nextInt();
	for(int i=1;i<n;i++)
	{	
		if(n%i==0)
		{
		sum=sum+i;
		}
	}
	if(sum==n)
	{
	System.out.print("given number is perfect number");
	}
	else
	System.out.print("given number is not perfect number");
	}
int divisor(int x)
{
return x;
}
}
		