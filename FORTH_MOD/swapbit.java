import java.util.Scanner;
class swapbit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b;
a=sc.nextInt();
b=sc.nextInt();
a=a^b;
b=a^b;
a=a^b;
System.out.println(a+" "+b);
}
}