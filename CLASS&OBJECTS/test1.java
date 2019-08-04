class test1
{
static int a;

static void print()
{
a=50;
System.out.println(a);
}
public static void main(String[] args)
{
test ob=new test();
a=20;
System.out.println(a);
print();
}
}