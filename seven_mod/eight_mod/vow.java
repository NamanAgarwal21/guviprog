import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class vow
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s;
s=sc.nextLine();
Pattern p=Pattern.compile("[aeiou]",Pattern.CASE_INSENSITIVE);
Matcher m =p.matcher(s);
if(m.find()){
System.out.print(s.matches("yes");}
else
System.out.print("no");
}}


