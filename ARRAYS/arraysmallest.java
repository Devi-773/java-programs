import java.util.Scanner;
 class mini
{
	public static void main(String[] args)
	{
	int n,min,i;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter array size");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.print("enter elements");
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	min=a[0];
	for(i=0;i<n;i++)
	{
		if(a[i]<min)
		{
		min=a[i];
		}
	}
	System.out.print("smallest element is"+min);
	}
}

						