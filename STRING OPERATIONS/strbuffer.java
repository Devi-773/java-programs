class strbuffer
{
	public static void main(String[] args)
	{
	StringBuffer b=new StringBuffer("hello");
	//substring
	String a=b.substring(0);
	String c=b.substring(1,4);
	System.out.println("Substring: "+a);
	System.out.println("substring: "+c);
	//reverse
	StringBuffer ob=new StringBuffer("hello");
	StringBuffer d=ob.reverse();
	System.out.println("reverse: "+d);
	
	//replace
	StringBuffer ob1=new StringBuffer("hello");	
	StringBuffer e=ob1.replace(1,4,"ipp");
	System.out.println("replace: "+e);
	
	//length
	StringBuffer ob2=new StringBuffer("hello");
	int f=ob2.length();
	System.out.println("length: "+f);
	
	//insert
	StringBuffer ob3=new StringBuffer("hello");
	StringBuffer g=ob3.insert(0,"Devi");
	System.out.println("insert: "+g);

	//delete
	StringBuffer ob4=new StringBuffer("hello");
	StringBuffer h=ob4.delete(3,5);
	System.out.println("delete: "+h);
	
	//capacity
	StringBuffer ob5=new StringBuffer("hello");
	int i=ob5.capacity();
	System.out.println("capacity: "+i);
	
	//append
	StringBuffer ob6=new StringBuffer("hello");
	StringBuffer j=ob6.append("Devi");
	System.out.println("append: "+j);

	//char at
	StringBuffer ob7=new StringBuffer("hello");
	char k=ob7.charAt(0);
	System.out.println("Chatat: "+k);
	}
}
	