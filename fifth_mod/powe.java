import java.util.Scanner;
import java.lang.Math;
class powe
{
public static void main(String args[]){
int c=0,n,sum=0,a;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n==1)
c=1;
while(n>0 && c==0){
a=n%2;
n=n/2;
sum=sum+a;
}
if(sum==1 && c==0)
System.out.println("yes");
else
System.out.println("no");
}}