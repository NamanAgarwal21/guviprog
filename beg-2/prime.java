import java.util.Scanner;

class prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,y=0,i;
a=sc.nextInt();
for(i=2;i<=(a/2);i++)
{
if(a%i==0)
{
y++;}}
if(y==0)
System.out.println("yes");
else
System.out.println("no");

}
}

