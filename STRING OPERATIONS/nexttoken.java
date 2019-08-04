import java.util.*;
class nexttoken
{
	public static void main(String[] args)
	{
	StringTokenizer ob=new StringTokenizer("hello are you");
	StringTokenizer ob1=new StringTokenizer("hello,world",",");
	String b=ob.nextToken();
	String c=ob1.nextToken();
	String d=ob1.nextToken();
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);	
	}
}