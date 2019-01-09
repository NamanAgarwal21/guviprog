import java.util.Scanner;
import java.lang.Math;
class arm
{
public static void main(String args[])
{
int n,y,k=0,a,x,sum=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
x=y=n;
while(n!=0)
{
n=n/10;
k++;
}
while(x!=0)
{
a=x%10;
x=x/10;
sum=sum + (int)Math.pow(a,k);}
if(sum==y)
System.out.println("yes");
else

System.out.println("no");}}



