import java.util.Scanner;
import java.util.Arrays;
public class sortarray
{
	public static void main(String[] args)
	{
	int i;
	Scanner sd=new Scanner(System.in);
	System.out.print("enter array size");
	int x=sd.nextInt();
	int[] a=new int[x];
	System.out.print("enter array elements");
	for(i=0;i<x;i++)
	{
	a[i]=sd.nextInt();
	}
	for(i=0;i<x;i++)
	{
	System.out.print(a[i]+" ");
	}
	Arrays.sort(a);
	System.out.print("sorted array is");
	for(i=0;i<x;i++)
	{
	System.out.print(a[i]+" ");
	}
	}
}