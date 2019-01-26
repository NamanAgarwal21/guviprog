import java.util.Scanner;
class high
{
public static void main(String args[]){
int n,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,i;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int ar[]=new int[n];
for(i=0;i<n;i++)
{
ar[i]=sc.nextInt();
if(ar[i]<min)
min=ar[i];
if(ar[i]>max)
max=ar[i];}

System.out.print(min+" "+max);
}}