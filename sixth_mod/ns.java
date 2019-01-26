import java.util.Scanner;
class ns
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,k,c=0,i;
n=sc.nextInt();
k=sc.nextInt();
int ar[]=new int[n];
for(i=0;i<n;i++){
ar[i]=sc.nextInt();
if(ar[i]==k)
c++;
}
if(c!=0)
System.out.print("yes");
else 
System.out.print("no");
}}