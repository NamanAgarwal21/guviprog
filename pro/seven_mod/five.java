import java.util.*;
class five
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,k,b,sum=0,i;
n=sc.nextInt();
k=sc.nextInt();
int ar[]=new int[n];
for(i=0;i<n;i++){
ar[i]=sc.nextInt();
sum=sum+ar[i];}

b=sc.nextInt();
sum=sum-ar[k];
sum=sum/2;
if(sum==b)
System.out.println("Bon Appetit");
else
System.out.println(b-sum);
}}