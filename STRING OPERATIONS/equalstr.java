 class equalstr
{
	public static void main(String[] args)
	{
	String s1=new String("hello");
	String s2=new String("devi");
	System.out.println(s1.equals(s2));
	String s3=new String("hello");
	String s4=new String("HELLO");
	System.out.println(s3.equalsIgnoreCase(s4));
	}
}