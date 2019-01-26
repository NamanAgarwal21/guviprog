import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class strn
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String n;
int c=0;
n=sc.nextLine();
String s="(.)*(\\d)(.)*";
Pattern p=Pattern.compile(s);
Matcher m=p.matcher(n);
if(m.find()){
c=1;
}
if(c==1)
System.out.print("Yes");
else
System.out.print("No");}}