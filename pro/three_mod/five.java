import java.util.*;
class five
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,j,i,k,c=1,co=1;
n=sc.nextInt();
int ar[]=new int[n];
for(j=0;j<n;j++){
ar[j]=sc.nextInt();
}
k=ar[0];
for(i=1;i<n;i++){
if(ar[i]>k){
k=ar[i];
c++;}
else{
k=ar[i];
if(co<c) co=c;
c=1;}}
System.out.println(co);}}