import java.util.*;
class reversestr
{
	public static void main(String[] args)
	{
	 char a[]=new char[100],temp;
	 Scanner ob=new Scanner(System.in);
	 System.out.println("string length");
	 int n=ob.nextInt();
	int i;
	 System.out.println("enter string");
	 for(i=0;i<n;i++)
	 {
		char c=ob.next().charAt(0);
		a[i]=c;
	 }
	 for(i=0;i<n;i++)
	 {
		System.out.print(a[i]+"\t");
	 }
System.out.println();
System.out.println("reverse of string is");
for(i=0;i<n/2;i++)
{
 temp=a[i];
a[i]=a[n-i-1];
a[n-i-1]=temp;
}
for(i=0;i<n;i++)
{
System.out.print(a[i]+"\t");
}
	}
}
	