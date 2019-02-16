import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class bi
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String n;
n=sc.nextLine();
System.out.print(n.matches("[0-1]*"));
}}