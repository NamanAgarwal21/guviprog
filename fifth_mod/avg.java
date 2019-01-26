import java.util.Scanner;
class avg
{
public static void main(String args[]){
int n,avg=0,i;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int ar[]=new int[n];
for(i=0;i<n;i++)
{
ar[i]=sc.nextInt();
avg=avg+ar[i];
}

System.out.println(avg/n);
}}