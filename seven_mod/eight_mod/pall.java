import java.util.Scanner;
class pall
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s,s1="";
int l,i;
char c;
s=sc.nextLine();
l=s.length();
for(i=l-1;i>=0;i--){
c=s.charAt(i);
s1=s1+c;}
if(s.equals(s1)){
System.out.print("yes");}
else
System.out.print("no");
}}