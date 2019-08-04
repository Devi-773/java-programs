public class arraysum
{
	public static void main(String[] args)
	{
	int a[]={1,2,3,4,5};
	int i,sum=0;
	int n=a.length;
	for(i=0;i<n;i++)
	{
	sum=sum+a[i];
	}
	System.out.print("sum is"+sum);
	
	}
}