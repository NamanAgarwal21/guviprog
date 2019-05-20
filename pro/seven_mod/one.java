import java.util.*;
class one{
public static void main(String args[]){
int t=0,i;
String a,b,s,n="";
char a1,b1;
Scanner sc=new Scanner(System.in);
a=sc.nextLine();
b=sc.nextLine();
s="abcdefghijklmnopqrstuvwxyz";
for(i=0;i<a.length();i++){
a1=a.charAt(i);
b1=b.charAt(i);
t=s.indexOf(a1)+s.indexOf(b1)+1;
t=t%26;
n=n+s.charAt(t);
}
System.out.println(n);}}
