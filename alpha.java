import java.util.Scanner;
class alpha
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char n;
n=sc.next().charAt(0);
if(n>=97 && n<=122 || n>=65 && n<=90)
{
	System.out.println("Alphabet");
	}
else
{
System.out.println("No");
}
}}

