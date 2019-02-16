import java.util.Scanner;
class sum
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,m;
n=sc.nextInt();
m=sc.nextInt();
n=n+m;
if(n%2==0)
System.out.print("even");
else
System.out.print("odd");
}}