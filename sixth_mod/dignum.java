import java.util.Scanner;
class dignum
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,a=0;
n=sc.nextInt();
while(n!=0){
i=n%10;
n=n/10;
a++;}
System.out.print(a);
}}