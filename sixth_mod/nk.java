import java.util.Scanner;
class nk
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,k,c=0,i;
n=sc.nextInt();
k=sc.nextInt();
int ar[]=new int[n];
for(i=0;i<n;i++){
ar[i]=sc.nextInt();
if(ar[i]==1)
c++;
}
System.out.print(c);
}}