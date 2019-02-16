import java.util.Scanner;
class sqr{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int s,n;
double r;
s=sc.nextInt();
n=sc.nextInt();
n=n*s;
r=Math.sqrt(n);
n=(int)r;
if(n==r)
System.out.println("yes");
else
System.out.print("no");
}}