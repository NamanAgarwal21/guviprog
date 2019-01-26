import java.util.Scanner;
class ap
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n,a,d,s=0;
n=sc.nextInt();
a=sc.nextInt();
d=sc.nextInt();
s=(a+(n-1)*d);
s=n*(a+s)/2;
System.out.print(s);
}}
