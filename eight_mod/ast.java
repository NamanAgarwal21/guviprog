import java.util.Scanner;
class ast{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s,s1="";
int l;
s=sc.nextLine();
l=s.length();
if(l%2!=0){
s1=s.substring(0,l/2)+'*'+s.substring(l/2+1);}
else
s1=s.substring(0,l/2-1)+"**"+s.substring(l/2+1);
System.out.println(s1);}}