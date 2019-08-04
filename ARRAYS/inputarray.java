import java.util.*;
public class inputarray
{
	public static void main(String[] args)
	{
	int i;
	Scanner sd=new Scanner(System.in);
	System.out.print("enter array size");
	int x=sd.nextInt();
	int a[]=new int[x];
	System.out.print("enter array elements");
	for(i=0;i<x;i++)
	{
	a[i]=sd.nextInt();
	}
	for(i=0;i<x;i++)
	{
	System.out.print(a[i]+" ");
	}
	}
}