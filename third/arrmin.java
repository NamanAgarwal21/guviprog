import java.util.Scanner;
class arrmin
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n,i;
int min=Integer.MAX_VALUE;
n=sc.nextInt();
int na[]=new int[n];
for(i=0;i<n;i++)
{
na[i]=sc.nextInt();
if(na[i]<min)
min=na[i];
}

System.out.print(min);
}}
