import java.util.*;
class one{
public static void main(String args[]){
int n,i,f=0,a1,a2,sum=0,av1,av2; 
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++){
arr[i]=sc.nextInt();
sum=sum+arr[i];
}
a2=sum-arr[0];
a1=arr[0];
av2=a2/(n-1);
if(a1==av2){f=1;System.out.println("yes");}
else{
for(i=1;i<n-1;i++){
a1=a1+arr[i];
a2=a2-arr[i];
av1=a1/(i+1);
av2=a2/(n-i-1);
if(av1==av2){
f=1;
System.out.println("yes");
break;}}}
if(f==0)System.out.println("no");}}