import java.util.Scanner;
class near
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,s=2;
n=sc.nextInt();
while((s-n)<=0){
s=s*2;}
System.out.print(s);
}}