import java.util.Scanner;
class median
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n,i,j,temp;
n=sc.nextInt();
int na[]=new int[n];
for(i=0;i<n;i++)
{
na[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=0;j>i;j++)
{
if(na[j]<na[j-1])
{
temp=na[j];
na[j]=na[j-1];
na[j-1]=na[j];
}}}
System.out.print(na[n/2]);
}}
