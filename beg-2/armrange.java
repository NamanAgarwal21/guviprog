import java.util.Scanner;
import java.lang.Math;
class armrange
{
public static void main(String args[])
{
int n,z,l,y,k=0,a,x,sum=0;
Scanner sc=new Scanner(System.in);
z=sc.nextInt();
l=sc.nextInt();
for(n=z+1;n<=l;n++)
{
	sum=0;
	k=0;
	x=n;
	y=n;
while(y!=0)
{
y=y/10;
k++;
}
while(x!=0)
{
a=x%10;
x=x/10;

sum=sum + (int)Math.pow(a,k);
}
if(sum==n)
System.out.print(n+" ");
}}
}


