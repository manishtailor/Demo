import java.util.Scanner;
class swip2
{
 public static void main(String args[])
{
int a,b;
System.out.println("enter two number");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
System.out.println("before swipping\n a: "+a+"\n b: "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("after swipping\n a: "+a+"\n b: "+b);
}
}