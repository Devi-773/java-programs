class replace
{
	public static void main(String[] args)
	{
	String s1="Hello";
	String s2=s1.replace("Hello","hai");
	String s3="java program java";
	String s4=s3.replaceFirst("java","hello");
	System.out.println(s2);
	System.out.println(s4);
	String s5="hello";
	System.out.println(s5.replace('l','a'));
	System.out.println(s5);
	String s6="java program java";
	String s7=s3.replaceAll("java","hello");
	System.out.print(s7);
	}
}