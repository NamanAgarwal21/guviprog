import java.util.Scanner;
class strcp
{
public static void main(String args[]){
int i,l1,l2,c=0,c1,c2;
String s1,s2;
Scanner sc=new Scanner(System.in);
s1=sc.next();
s2=sc.next();
l1=s1.length();
l2=s2.length();
if(l1>l2)
System.out.println(s1);
else if (l1<l2)
System.out.println(s2);
else{
for(i=0;i<l1 && i<l2;i++){
c1=(int)s1.charAt(i);
c2=(int)s2.charAt(i);
if(c1>c2)
continue;
else if (c1<c2)
{
System.out.println(s2);
c=1;
break;
}}
if(c==0)
System.out.println(s1);
}}}