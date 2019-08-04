class rectangle
{
 int l,b;
 rectangle()
 {
  area();
  paremeter();
 }
 void area()
 {
  int a;
  a=l*b;
  System.out.println(a);
 }
 void paremeter()
 {
  int a;
  a=2*(l+b);
  System.out.println(a);
 }
}
class test
 {
  public static void main(String[] args)
  {
   rectangle ob=new  rectangle();
   ob.l=10;
   ob.b=10;
   ob.area();
   ob.paremeter();
  }
}

   
   
   

