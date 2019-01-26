import java.util.Scanner;
class arrindex{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i;
n=sc.nextInt();
int ar[]=new int[n];
for(i=0;i<n;i++)
{
ar[i]=sc.nextInt();
}
for(i=0;i<n;i++){
System.out.print(ar[i]+" "+i);
System.out.println();
}}}