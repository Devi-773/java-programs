class stroperations
{
	public static void main(String[] args)
	{
	String s2=new String("hello");
	System.out.println("String length:"+s2.length());
	
	String s3=new String("devi");
	System.out.println("String equal"+s2.equals(s3));

	String s5=new String("HELLO");
	System.out.println("String equal ignoring case"+s2.equalsIgnoreCase(s5));
	
	String s6=s2.concat(s5);
	System.out.println("concat is "+s6);
	
	System.out.println("concat1: "+s2+s5);
	
	System.out.println("compare to is: "+s2.compareTo(s3));
	System.out.println("compare to ignore case is: "+s2.compareToIgnoreCase(s5));
	
	String r2=s2.replace("Hello","hai");
	String r3="java program java";
	String r4=r3.replaceFirst("java","hello");
	System.out.println("replace: "+r2);
	System.out.println("replace first: "+r4);
	System.out.println("replace: "+s2.replace('l','a'));

	String r7=r3.replaceAll("java","hello");
	System.out.println("replace All: "+r7);

	String u2=s2.toUpperCase();
	System.out.println("upper case: "+u2);

	String c2=s2.substring(0,2);
	System.out.println("substring: "+c2);

	String l2=s2.toLowerCase();
	System.out.println("lowercase: "+l2);

	int i1=s2.indexOf("H");
	int i4=r3.lastIndexOf('l');
	System.out.println("index of: "+i1);
	System.out.println("last index of: "+i4);
	
	boolean b=s3.startsWith("de");
	System.out.println("Starts with: "+b);
	 
	
	boolean b1=s3.endsWith("de");
	System.out.println("Starts with: "+b1);
	
	}
}