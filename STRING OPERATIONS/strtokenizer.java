import java.util.*;
class tokenizer
{
	public static void main(String[] args)
	{
	StringTokenizer ob=new StringTokenizer("hello are you");
	StringTokenizer ob1=new StringTokenizer("hello,world",",");
	int a=ob.countTokens();
	System.out.println(a);
	int b=ob1.countTokens();
	System.out.println(b);
	String e=ob.nextToken();
	String c=ob1.nextToken();
	String d=ob1.nextToken();
	System.out.println(e);
	System.out.println(c);
	System.out.println(d);	
	}
}