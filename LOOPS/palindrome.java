public class palindrome
{
	public static void main(String[] args)
	{
	int a=121,sum=0,n,b;
	n=a;
	while(n!=0)
	{
	b=n%10;
	sum=(sum*10)+b;
	n=n/10;
	}
	System.out.println(sum);
	if(sum==a)
	{
	System.out.print("palindrome");
	}
	else
	{
	System.out.print("not a palindrome");
	}
	}
}