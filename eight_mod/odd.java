import java.util.Scanner;
import java.lang.*;
class odd{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,n,i;
String s="";
n=sc.nextInt();
while(n!=0){
a=n%10;
n=n/10;
if(a%2!=0)
s=s+" "+a;}
char[] c=s.toCharArray();
for(i=c.length-1;i>0;i--)
System.out.print(c[i]);
}}