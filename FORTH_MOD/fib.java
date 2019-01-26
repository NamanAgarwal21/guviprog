import java.util.Scanner;
class fib
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n,a=1,b=1,c;
n=sc.nextInt();
if(n==1){
System.out.println("1");}
else if(n==2)
System.out.println("1 1");
else{
System.out.print("1 1 ");
for(i=3;i<=n;i++){
c=a+b;
System.out.print(c+" ");
a=b;
b=c;
c=a+b;
}
}}}