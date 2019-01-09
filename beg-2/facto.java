import java.util.Scanner;
class facto
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int x=1,n,i;
n=sc.nextInt();
for(i=1;i<=n;i++)
{
x=x*i;
}
System.out.print(x+" ");
}}
