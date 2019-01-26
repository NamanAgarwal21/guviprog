import java.util.Scanner;
class arrmax
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n,i,max=0;
n=sc.nextInt();
int na[]=new int[n];
for(i=0;i<n;i++)
{
na[i]=sc.nextInt();
if(na[i]>max)
max=na[i];
}

System.out.print(max);
}}
