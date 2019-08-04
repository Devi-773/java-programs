 class switchcase
{
 public static void main(String[] args)
 {
  int a=20,b=10,c;
  char op='/';
  switch(op)
  {
   case '+':c=a+b;
            System.out.println(c);
            break;
   case '-':c=a-b;
            System.out.println(c);
            break;
   case '*':c=a*b;
            System.out.println(c);
            break;
   case '/':c=a/b;
            System.out.println(c);
            break;
   case '%':c=a%b;
            System.out.println(c);
            break;
   default:System.out.println("Wrong option");
  }
}
}



